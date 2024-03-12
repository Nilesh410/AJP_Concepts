
class Outer 
{
	static int i;
	static class Inner
	{
		int j;
		void show()
		{
			System.out.println("i="+i+"j="+j);
		}
	}
}

public class Static_Inner_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.i=10;
		
		Outer.Inner obj1=new Outer.Inner();
		obj1.j=20;
		obj1.show();

	}

}
