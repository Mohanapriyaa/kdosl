
import java.util.*;
public class sorting {

	
	public static void main(String[] args) {

		int n,temp;
       int i1=0;
		Scanner in=new Scanner(System.in);
        System.out.println("enter the numbers to be sorted:");
        n=in.nextInt();
        int[] arr=new int[n];
		 System.out.println("enter the integers:");
		 for(int i=0;i<n;i++)
		 {
		 arr[i]=in.nextInt();
		 }
		for( i1=0;i1<n;i1++)
		{
			for(int j=i1+1;j<n;j++)
			{
				if(arr[i1]>arr[j])
				{
				temp=arr[i1];
				arr[i1]=arr[j];
				arr[j]=temp;
				
				}
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		}
}


