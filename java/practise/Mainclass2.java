class Sample16
{
int x=10;
}
class Demo extends Sample16
{
void disp()
{
System.out.println("hi");
}
}
class Tester extends Demo
	{
	void test()
		{
		System.out.println("ulti");
}
}
class Mainclass2
{
public static void main(String[] args)
{
Tester t=new Tester();
System.out.println(t.x);
t.disp();
t.test();
}
}