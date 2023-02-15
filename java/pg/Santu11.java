class Santu11
{
public static void main(String[] args)
{
String str="appa";
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
if(str.equals(rev))
	{
System.out.println("rev str");
	}
	else
	{
		System.out.println("not rev");
}
}
}
