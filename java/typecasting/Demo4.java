class Demo4
{
int x=10;
}
class Sample extends Demo4
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
Demo4 d4=new Sample();
System.out.println(d4.x);
Sample s=(Sample)d4;
s.disp();
System.out.println(s.x);
}
}