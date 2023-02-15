class Santu10
{
public static void main(String[] args)
{
int n=153;
int copy=n;
int sum=0;
while(n!=0)
{
int rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(copy==sum)
{
System.out.println("armstrong no");
}
else
	{
System.out.println("not armstrong no");
}
}
}
