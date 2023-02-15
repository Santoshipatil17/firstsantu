class Sample15
{
int stdid;
String stdname;
Sample15(int x,String y)
{
this.stdid=x;
stdname=y;
}
public static void main(String[] args)
{
Sample15 s=new Sample15(5,"de");
System.out.println(s.stdid);
System.out.println(s.stdname);
}
}