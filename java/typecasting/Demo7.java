class Demo7
{
int x=10;
}
class Sample extends Demo7
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
Demo7 d7=new Sample();
System.out.println(d7.x);
Sample s=(Sample)d7;
s.disp();
System.out.println(s.x);
}
}