package com.project.userdataflow;

import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class processDao extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
       HttpSession session = request.getSession();
       
       UserDetailsDAO udao = new UserDetailsDAOImpl();
       List<UserDetails> ud = udao.listAllUsers();
       session.setAttribute("user", ud);
       //response.sendRedirect("pgControlPanel.jsp");
    }
     
     
}
