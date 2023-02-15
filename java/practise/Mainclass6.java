abstract interface Sample
{
void disp();
void fo();
}
abstract class Demo implements Sample
{
public void disp()
{
System.out.println("ulti");
}
}
class Tester extends Demo
{
public void fo()
{
System.out.println("hii");
}
}
class Mainclass6
{
public static void main(String[] args)
{
Tester t=new Tester();
t.disp();
t.fo();
}
}