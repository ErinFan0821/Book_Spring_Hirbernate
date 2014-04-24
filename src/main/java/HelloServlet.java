import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by techops on 4/24/14.
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String author = request.getParameter("author");

        PrintWriter writer = response.getWriter();
        writer.println(isbn);
        writer.println(name);
        writer.println(price);
        writer.println(author);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>" + "BookShelf" + "</h1>");
        writer.println("<form action=\"Hello\" method=\"post\">"+
                "ISBN: <input type=\"text\" name=\"isbn\" />\n" +
                "Name: <input type=\"text\" name=\"name\" />\n" +
                "Price: <input type=\"text\" name=\"price\" />\n"+
                "author: <input type=\"text\" name=\"author\" />\n"+
                "<input type=\"submit\" value=\"Submit\" />\n"+
                "</form>"
        );
    }
}
