class Pattern1 extends Object
{
public static void main(String args[])
{
Object a=new Pattern();
a.main1();
int i,j,s,n=5;
for(i=1;i<=n;i++)
	{
	for(s=1;s<=n-i;s++)
		System.out.print("-");
	for(j=1;j<=i;j++)
		System.out.print("*");
	System.out.println();
	}
}
}