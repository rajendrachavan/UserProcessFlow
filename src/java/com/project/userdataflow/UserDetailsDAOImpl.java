package com.project.userdataflow;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDetailsDAOImpl implements UserDetailsDAO {

    static Connection con = null;
    static PreparedStatement pst = null;
    
    @Override
    public int insertUser(UserDetails udata) {
        int status = 0;
        try{
            con = SqlConnector.getConnection();
            pst = con.prepareStatement("insert into UserDetailsDB values(?,?,?,?,?,?)");
            pst.setString(1, udata.getUsername());
            pst.setString(2, udata.getDob());
            pst.setString(3, udata.getGender());
            pst.setLong(4, udata.getMobno());
            pst.setString(5, udata.getEmailid());
            pst.setString(6, udata.getPassword());
            status = pst.executeUpdate();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public UserDetails getUserDetails(String userid, String passwd) {
        UserDetails userdata = new UserDetails();
        try{
            con = SqlConnector.getConnection();
            pst = con.prepareStatement("SELECT emailid,passwd,username FROM UserDetailsDB WHERE emailid = ? and passwd = ?");
            pst.setString(1, userid);
            pst.setString(2, passwd);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                userdata.setEmailid(rs.getString(1));
                userdata.setPassword(rs.getString(2));
                userdata.setUsername(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return userdata;
    }
    
    @Override
    public List<UserDetails> listAllUsers() {
        List<UserDetails> listUser = new ArrayList<>(); 
        UserDetails ud = new UserDetails();
        try{
            String sql = "SELECT * FROM UserDetailsDB";
            con = SqlConnector.getConnection();
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ud.setUsername(rs.getString(1));
                ud.setDob(rs.getString(2));
                ud.setGender(rs.getString(3));
                ud.setMobno(rs.getLong(4));
                ud.setEmailid(rs.getString(5));
                ud.setPassword(rs.getString(6));

                listUser.add(ud);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listUser;
    }
    
    public boolean deleteUser(UserDetails ud){
        boolean rowDeleted = false;
        try{
            String sql = "DELETE FROM UserDetailsDB where id = ?";
            con = SqlConnector.getConnection();
            pst = con.prepareStatement(sql);
            //pst.setInt(1,);

            rowDeleted = pst.executeUpdate() > 0;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return rowDeleted;     
    }
    
    public boolean updateUser(UserDetails ud){
        boolean rowUpdated = false;
        try{
            String sql = "UPDATE UserDetailsDB SET username = ?, dob = ?, gender = ?";
            sql += ", mobno = ?, emailid = ?, passwd = ? WHERE id = ?";

            con = SqlConnector.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, ud.getUsername());
            pst.setString(2, ud.getDob());
            pst.setString(3, ud.getGender());
            pst.setLong(4, ud.getMobno());
            pst.setString(5, ud.getEmailid());
            pst.setString(6, ud.getPassword());
            
            rowUpdated = pst.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
        }
                
        return rowUpdated;     
    }
}
