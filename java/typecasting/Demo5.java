class Demo5
{
int x=10;
}
class Sample extends Demo5
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
Demo4 d5=new Sample();
System.out.println(d5.x);
Sample s=(Sample)d5;
s.disp();
System.out.println(s.x);
}
}