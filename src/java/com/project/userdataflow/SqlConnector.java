package com.project.userdataflow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlConnector implements SqlCredentials{
    
    private String sqlQuery = "SELECT * FROM UserDetailsDB";
    
    static Connection con = null;
    static PreparedStatement pst = null;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
