class Construc
{
int stdno;
String stdname;
Construc(int x,String y)
{
stdno=x;
stdname=y;
}
public static void main(String[] args)
{
Construc c=new Construc(11,"sur");
System.out.println(c.stdno);
System.out.println(c.stdname);
}
}
