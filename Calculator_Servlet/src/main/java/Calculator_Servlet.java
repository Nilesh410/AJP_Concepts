import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Calculator_Servlet extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	double d1=Double.parseDouble(req.getParameter("num1"));
    	double d2=Double.parseDouble(req.getParameter("num2"));
    	double result;
    	String opr=req.getParameter("opr");
    	
    	if(opr.equals("+"))
    		result=d1+d2;
    	else if(opr.equals("-"))
    		result=d1-d2;
    	else if(opr.equals("*"))
    		result=d1*d2;
    	else {
    		result=d1/d2;}
    	
    	PrintWriter pw=res.getWriter();
    	pw.println("Operation:"+opr+":"+"Result:"+result);
    	
    }
}
