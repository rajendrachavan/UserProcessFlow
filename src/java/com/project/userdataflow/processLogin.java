package com.project.userdataflow;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class processLogin extends HttpServlet {
    
    public void  doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        UserDetailsDAO udao = new UserDetailsDAOImpl();
        String username = req.getParameter("usrname");
        String chkpasswd = req.getParameter("chkpasswd");
        String Admin = "admin";
        String Adminpass = "admin123";
        
        HttpSession session = req.getSession();
        UserDetails ud = udao.getUserDetails(username, chkpasswd);
        
        try{
            if(username.equalsIgnoreCase(Admin) && chkpasswd.equals(Adminpass)){
                session.setAttribute("user", username);
                res.sendRedirect("pgControlPanel.jsp");
            }else if(username.equals(ud.getEmailid()) && chkpasswd.equals(ud.getPassword())){
                session.setAttribute("user", ud.getUsername());
                res.sendRedirect("pgWelcome.jsp");
            }else{
                res.sendRedirect("pgLogin.jsp");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
       
        
    }
}

    