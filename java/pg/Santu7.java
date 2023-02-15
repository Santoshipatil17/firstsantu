class Santu7
{
public static void main(String[] args)
{
int n=1234567;
int evencount=0;
int oddcount=0;
while(n!=0)
	{
int rem=n%10;
if(rem%2==0)
{
evencount++;
}
else if(rem%2==1)
{
oddcount++;
}
n=n/10;
}
System.out.println(evencount);
System.out.println(oddcount);
	}
}
