package com.vaer.hw2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegFormServlet", value = "/regform")
public class RegFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String phoneNumber = request.getParameter("phonenumber");
        response.setContentType("text/html");
        PrintWriter writer = null;
        RequestDispatcher dispatcher = request.getRequestDispatcher("/error");

        if(userName == null || phoneNumber == null){
            dispatcher.forward(request, response);
        }else{
               try {
                   writer = response.getWriter();
                   writer.println("<html><head><title>RegForm Servlet</title><body>");
                   writer.println("<h2>This is register form servlet page</h2>");
                   writer.println("<p>Your name is:  " + userName + "</p>");
                   writer.println("<p>Your phone number is:  " + phoneNumber + "</p>");
                   writer.println("</body></html>");
               }finally{
                   writer.close();
               }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
