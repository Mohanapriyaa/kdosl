
public class Subset {

	
	public static void main(String[] args) {
    int a[]={4,6,9,8,5};
    int b[]={9,6,4};
    int n1=a.length;
    int n2=b.length;
    int c=0;
    for(int i=0;i<n1;i++)
    {
    	for(int j=0;j<n2;j++)
    	{
    	if(a[i]==b[j])
    	{
    	c++;
	}
    	}
    }
    if(c==n1)
    {
    	System.out.println("b is subset of a");
    }
    else
    {
    	System.out.println("b is not subset of a");
    }
}
}

