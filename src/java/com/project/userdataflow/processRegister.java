package com.project.userdataflow;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class processRegister extends HttpServlet {
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        HttpSession session = req.getSession();
        
        UserDetailsDAO udao = new UserDetailsDAOImpl();
        UserDetails ud = new UserDetails();
        
        Long mobno = Long.parseLong(req.getParameter("mobno"));
        
        ud.setUsername(req.getParameter("username"));
        ud.setDob(req.getParameter("dob"));
        ud.setGender(req.getParameter("genderValue"));
        
        ud.setMobno(mobno);
        ud.setEmailid(req.getParameter("emailid"));
        ud.setPassword(req.getParameter("passwd"));
        udao.insertUser(ud);
        res.sendRedirect("pgLogin.jsp");
    }
}
