import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by techops on 4/24/14.
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ISBN = "isbn";
        String name = "I have a dream";
        float price = (float) 1.1;
        String author = "ErinFan";
        response.getWriter().println("<h1>" + "Book Shelf" + "</h1>");
        response.getWriter().println("Book Name: " + name);
        response.getWriter().println("Book Price: " + price);
        response.getWriter().println("Book Author: " + author);
        response.getWriter().println("Book ISBN: " + ISBN);





    }
}
