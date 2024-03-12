import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	
	 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
     {
   	      int a=Integer.parseInt(req.getParameter("num1"));
   	      int b=Integer.parseInt(req.getParameter("num2"));
   	      int c=a+b;
   	      System.out.println("C="+c);
   	      req.setAttribute("c",c);
   	      RequestDispatcher rd=req.getRequestDispatcher("square");
   	      rd.forward(req, res);
//   	      PrintWriter pw=res.getWriter();
//   	      pw.println("addition="+c);
     }
}
