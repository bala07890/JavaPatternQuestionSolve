package Pattern2;

public class CentreTriangleDownWard 
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=n;l>i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
