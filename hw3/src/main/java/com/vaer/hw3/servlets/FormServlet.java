package com.vaer.hw3.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is FormsServlet");

        response.setContentType("text/html");
        String formPath = "/html/forms.html";
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(formPath);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
