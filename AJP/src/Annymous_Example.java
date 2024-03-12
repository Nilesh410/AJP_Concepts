interface Phone
{
	void show();
	
}



public class Annymous_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone obj=()->System.out.println("call"+""+"gaming");  
         obj.show();
	}

}
