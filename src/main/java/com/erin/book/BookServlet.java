package com.erin.book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by techops on 5/11/14.
 */
public class BookServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + "BookShelf" + "</h1>");
        writer.println("<form action=\"Book\">\n" +
                "    ISBN:<input type=\"text\" name=\"isbn\"/><br />\n" +
                "    BookName:<input type=\"text\" name=\"name\"><br />\n" +
                "    Author:<input type=\"text\" name=\"author\"><br />\n" +
                "    Price:<input type=\"text\" name=\"price\"><br />\n" +
                "    <input type=\"submit\" value=\"submit\" />\n" +
                "</form>");
    }
}
