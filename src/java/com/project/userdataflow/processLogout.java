package com.project.userdataflow;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class processLogout extends HttpServlet {
    public void  doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        HttpSession session = req.getSession();
        session.removeAttribute("admin");
        session.invalidate();
        res.sendRedirect("pgLogin.jsp");
    }
}
