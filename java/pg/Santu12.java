class Santu12
{
static void fact(int n)
{
int fact=1;
for(int i=n;i>=1;i--)
{
fact=fact*i;
System.out.println(fact);
}
}
public static void main(String[] args)
{
fact(7);
}
}
