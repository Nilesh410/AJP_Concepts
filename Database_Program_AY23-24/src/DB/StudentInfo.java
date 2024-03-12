package DB;
//1.import required package
import java.sql.*;

import com.mysql.cj.protocol.Resultset;
public class StudentInfo {

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/322401_m6";
		String uname="root";
		String password="0410";
		String query="select *from studentinfo_M6";
       
	   //2.load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//3.Establish the connection
		Connection con=DriverManager.getConnection(url, uname, password);
		System.out.println("Successfully Connected with Database");
		
		//4.Create a statement
		Statement st=con.createStatement();
		
		//5.execute the query
		ResultSet rs=st.executeQuery(query);
		
		//6.Process the result
		System.out.println("Rollno"+"\t"+"StdName"+"\t"+"Batch"+"\t"+"SubName"+"\t"+"Marks");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
		
		//7.Close the connection
		con.close();
		st.close();			
	}
}
