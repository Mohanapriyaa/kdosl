import java.util.Scanner;


public class strrev {

	
	public static void main(String[] args) {
		 String real,s1="";
		   Scanner s=new Scanner(System.in);
		   real=s.nextLine();
		   String[] Arr=real.split(" ");
		   for(int i=Arr.length-1;i>=0;i--)
		     {
		       s1=s1+" "+Arr[i];
		     }
		     System.out.println(s1);
		  
	}

}
