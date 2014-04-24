import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by techops on 4/24/14.
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3306/BookShelf" ;
        String username = "root" ;
        String password = "root" ;
        try{
            Connection con =
                    DriverManager.getConnection(url, username, password);

        }catch(SQLException se){
            System.out.println("数据库连接失败！");
            se.printStackTrace() ;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>" + "BookShelf,get" + "</h1>");
        writer.println("<form action=\"add\">"+
                "ISBN: <input type=\"text\" name=\"isbn\" />\n" +
                "Name: <input type=\"text\" name=\"name\" />\n" +
                "Price: <input type=\"text\" name=\"price\" />\n"+
                "author: <input type=\"text\" name=\"author\" />\n"+
                "<input type=\"submit\" value=\"Submit\" />\n"+
                "</form>"
        );
    }
}
