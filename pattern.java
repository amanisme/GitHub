class Pattern
{
public void	main1()
{
int i,j,n=5,k;
System.out.println("Printing patttern");
for(i=n;i>0;i--)
	{
	for(j=(i-1);j>0;j--)
		{
		System.out.print("-");
		}
	for(k=0;k<(n-i+1);k++)
			{
			System.out.print("*");
			}
	System.out.println();
	}
}
}