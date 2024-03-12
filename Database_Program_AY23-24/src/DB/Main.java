package DB;

import java.util.Scanner;
import java.sql.*;

public class Main {
	
	Connection con;//7th Task
	Derived data; //15th Task
    Main() //2nd task
    {
    	data=new Derived(); //15th Task
    }
	public static void main(String[] args) 
	{
		Main obj=new Main();//1st task
		obj.getconnection();//3rd task
		Scanner in=new Scanner(System.in);//10th Task
		int ch;
		try
		{
		  do
		  {
			System.out.println("Select the operation");
			System.out.println("\n1.Create the table \n2.Insert the data \n3.Fetch Data \n4.Delete Record \n5.Update Record \n6.Search Record \n7.Close Connection");
			int choice =in.nextInt();
			switch(choice)
			{
			   case 1:obj.createtable();
			          break;
			   case 2:obj.insert();
			          break;
			   case 3:obj.fetchdata();
			          break;
			   case 4:obj.delete();
			          break;
			   case 5:obj.update();
			          break;
			   case 6:obj.search();
			          break;
			   case 7:obj.closeconnection();
			          break;
		default:System.out.println("Enter the correct option");
			           break;
			}   
			System.out.println("Do you want to continue then press 1 otherwise 0");
			ch=in.nextInt();   
		  }while(ch!=0);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
			
	}

	
	void getconnection()//4th Task
	{
		String driver="com.mysql.cj.jdbc.Driver";//6th task
		String url="jdbc:mysql://localhost:3306/k6";
		String username="root"; //Enter your account username
		String password="0410"; //Enter your account password
		try //9th task
		{
			Class.forName(driver);//5th Task
			con=DriverManager.getConnection(url,username,password); //8th task
		System.out.println("Connection established successfully");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
    void createtable() //11th Task
    {
      try
      {
    	String query="create table student3(rollno int,name varchar(10),sub varchar(10),marks int,primary key(rollno))";
    	PreparedStatement st=con.prepareStatement(query);
    	int i=st.executeUpdate();
    	System.out.println("Table Created successfully"+i);
      }
      
      catch(Exception E)
      {
    	  System.out.println(E);
    	  System.out.println("Select the next oepration");
      }
    }
    void insert()throws SQLException  //12th task
    {
    	data.get_data();
    	String query="insert into student3 values(?,?,?,?)";
    	PreparedStatement st=con.prepareStatement(query);
    	st.setInt(1, data.retrollno());
    	st.setString(2, data.retname());
    	st.setString(3, data.retsub());
    	st.setInt(4, data.retmarks());
    	int i=st.executeUpdate();
    	System.out.println("No of rows affected"+i);
    }
    void fetchdata()throws SQLException //16th Task
    {
    	String query="select * from student3";
    	PreparedStatement st= con.prepareStatement(query);
    	ResultSet rs=st.executeQuery();
    	System.out.println("Rollno" +"\t"+"Std_name"+"\t"+"Sub_name"+"\t"+"Marks");
    	while(rs.next())
    	{
    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t        "+rs.getString(3)+"\t         "+rs.getInt(4));
    	}
    }
    void update()throws SQLException //17th Task
    {
    	int rollno,marks;
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the rollno to updated");
    	rollno=in.nextInt();
    	PreparedStatement st=con.prepareStatement("update student3 set marks=? where rollno=?");
    	System.out.println("Enter the marks to updated");
    	marks=in.nextInt();
    	st.setInt(1, marks);
    	st.setInt(2, rollno);
    	st.executeUpdate();
    }
    void search()throws SQLException//18th Task
    {
    	int rollno;
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the rollno to be search");
    	rollno=in.nextInt();
    	PreparedStatement st=con.prepareStatement("select *from student3 where rollno=?");
    	st.setInt(1, rollno);
    	ResultSet rs=st.executeQuery();
    	System.out.println("Rollno" +"\t"+ "Student_name"+"\t"+"Subject_name"+"\t"+"Marks");
    	while(rs.next())
    	{
    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t        "+rs.getString(3)+"\t         "+rs.getInt(4));
    	}
    	
      }
    void delete()throws SQLException//19th Task
    {
    	int rollno;
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the rollno to be search");
    	rollno=in.nextInt();
    	PreparedStatement st=con.prepareStatement("delete from student3 where rollno=?");
    	st.setInt(1, rollno);
    	st.executeUpdate();
    }
    void closeconnection()throws SQLException //20th Task
    {
    	con.close();
    	System.out.println("Closed database connection");
    }
 }


class Base //13th Task
{
	int rollno;
	String name;
	
	public void get_data()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the rollno and name of the student");
		rollno=input.nextInt();
		name=input.next();
	}
	public int retrollno()
	{
		return rollno;
	}
	public String retname()
	{
		return name;
	}	
}
class Derived extends Base //14th Task
{
	int marks;
	String sub;
	
	public void get_data()
	{
		Scanner in=new Scanner(System.in);
		super.get_data();
		System.out.println("Enter the sub name and marks");
		sub=in.next();
		marks=in.nextInt();
	}
	public String retsub()
	{
		return sub;
	}
	public int retmarks()
	{
		return marks;
	}
}

