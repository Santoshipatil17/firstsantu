class Santu2
{
public static void main(String[] args)
{
int n=8;
boolean flag=true;
for(int i=2;i<7;i++)
{
if(n%i==0)
{
flag=false;
break;
}
}
if(flag==true)
{
System.out.println("prime no");
}
else
{
System.out.println("not primeno");
}
}
}