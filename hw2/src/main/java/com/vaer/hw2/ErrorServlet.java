package com.vaer.hw2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ErrorServlet", value = "/error")
public class ErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = null;
        try{
            writer = response.getWriter();
            writer.println("<html><head><title>Error Servlet</title><body>");
            writer.println("<h2>This is error servlet page</h2>");
            writer.println("<p>If you are here that is because you forgot enter ALL parameters :) </p>");
            writer.println("</body></html>");
        }finally{
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
