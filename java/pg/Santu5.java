class Santu5
{
public static void main(String[] args)
{
int n=123;
int rev=0;
int copy=n;
while(n!=0)
{
int rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(copy==n)
	{
System.out.println(palindrome);
}
else
	{
	System.out.println("not palindrome");
	}
}