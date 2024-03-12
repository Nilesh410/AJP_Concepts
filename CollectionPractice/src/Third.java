import java.util.ArrayList;
import java.util.Arrays;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]= {"dog","cat","element"};
       for(String s:arr)
       {
    	   System.out.println(s);
       }
       //convert array into arraylist
       ArrayList al=new ArrayList(Arrays.asList(arr));
       System.out.println(al);
	}

}
