
//Member Inner class
class A
{
	int i;
	class B
	{
		int j;
		void show()
		{
			System.out.println("i="+i+"j="+j);
		}
	}
}
public class Inner_Class_Example {

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.i=10;
		
		A.B obj1=obj.new B();
		obj1.j=20;
		obj1.show();

	}

}
