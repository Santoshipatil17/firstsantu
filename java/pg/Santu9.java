class Santu8
9
{
public static void main(String[] args)
{
int n=28;
int copy=n;
int sum=0;
for(int i=1;i<=n/2;i++)
	{
	if(n%i==0)
		{
		sum=sum+i;
		}
	}
if(copy==sum)
{
System.out.println("perfect");
}else{
System.out.println("not perfect");
}
}
}
