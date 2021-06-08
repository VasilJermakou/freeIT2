package com.vaer.hw2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class StartingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = null;
        try{
            writer = response.getWriter();
            writer.println("<html><head><title>Starting Servlet</title><body>");
            writer.println("<h2>WELCOME to STARTING PAGE!!!</h2>");
            writer.println("<p><a href=\"http://google.com\">Google link</a></p>");
            writer.println("</body></html>");

        }finally{
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
