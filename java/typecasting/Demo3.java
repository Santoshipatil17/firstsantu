class Demo3
{
int x=10;
}
class Sample extends Demo3
{
void disp()
{
System.out.println("disp");
}
}
class Typecast1
{
public static void main(String[] args)
{
Demo2 d2=new Sample();
System.out.println(d3.x);
Sample s=(Sample)d3;
s.disp();
System.out.println(s.x);
}
}