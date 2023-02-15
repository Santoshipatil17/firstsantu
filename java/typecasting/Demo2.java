class Demo2
{
int x=10;
}
class Sample extends Demo2
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
System.out.println(d2.x);
Sample s=(Sample)d2;
s.disp();
System.out.println(s.x);
}
}