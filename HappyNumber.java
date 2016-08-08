import java.util.Scanner;


public class HappyNumber {

		public static void main(String[] args) {
			int a=19;
			int sum=0;
			int c=0;
			while(sum!=1)
			{   
				sum=0;
				while(a!=0)
				{
			    c=a%10;
			   int output=(int) Math.pow(c,2);
				sum=sum+output;
				a=a/10;
				}
				a=sum;
			}
			System.out.println(sum);
	
		}

}
