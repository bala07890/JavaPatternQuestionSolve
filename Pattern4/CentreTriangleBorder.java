package Pattern4;

public class CentreTriangleBorder 
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=1;k<n;k++)
			{
				if(i==k||i==n-1)
				    System.out.print("*");	
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
