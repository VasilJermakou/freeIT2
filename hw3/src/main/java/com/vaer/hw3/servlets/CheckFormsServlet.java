package com.vaer.hw3.servlets;

import com.vaer.hw3.beans.Data;
import com.vaer.hw3.beans.User;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CheckFormsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is CheckFroms Servlet");

        Data data = Data.getInstance();

        String userEmail = request.getParameter("email");
        Boolean isUserInDataBase = false;

        for(String email : data.getUserEmails()){
            if(userEmail.equals(email)){
                isUserInDataBase = true;
                break;
            }
        }

        String userName = request.getParameter("fname");
        String userLName = request.getParameter("lname");
        String email = request.getParameter("email");
        Integer phone = Integer.parseInt(request.getParameter("phone"));
        User user = new User(userName, userLName, phone, email);

        if(isUserInDataBase){
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/jsp/currentuser.jsp").forward(request, response);
        }else{
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/jsp/alien.jsp").forward(request, response);
        }
    }
}
