package com.vaer.hw2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = null;

        String name = request.getParameter("name");
        String id = request.getParameter("id");
        try{
            writer = response.getWriter();
            writer.println("<html><head><title>Param Servlet</title><body>");
            writer.println("<h2>This is param servlet page</h2>");
            writer.println("<p>Your name is:  " + name + "</p>");
            writer.println("<p>Your id is:  " + id + "</p>");
            writer.println("</body></html>");
        }finally{
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
