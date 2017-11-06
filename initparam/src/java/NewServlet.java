import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {  
            String s="";
           out.println(getServletContext().getInitParameter("center"));
           out.println(getServletContext().getInitParameter("city"));
           ServletConfig sc=getServletConfig();
           Enumeration<String> en=sc.getInitParameterNames();
           while(en.hasMoreElements())
           {
               s=en.nextElement();
               out.print("<p>"+getServletConfig().getInitParameter(s) +"</p>");
           }
           
        } finally {            
            out.close();
        }
    }

   

    
}
