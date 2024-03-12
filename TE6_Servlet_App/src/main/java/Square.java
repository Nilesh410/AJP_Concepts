import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Square extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
		 res.setContentType("text/html;charset=UTF-8");
		 PrintWriter pw=res.getWriter();
		 pw.println("<html><head><title>Square</title></head><body>");
  	     int k=(int)req.getAttribute("c");
  	     pw.println("<h1>Addition Result="+k);
  	     pw.println("<h1>square of addition="+k*k);
  	     pw.println("</body></html>");
    }
}
