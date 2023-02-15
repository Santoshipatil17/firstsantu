abstract class Sample2
{
abstract void test();
abstract void cool();
}
abstract class Tester2 extends Sample2
{
void test()
{
System.out.println("hi");
}
}
class Demo extends Tester2
{
void cool()
{
System.out.println("hello");
}
public static void main(String[] args)
{
Demo d2=new Demo();
d2.cool();
d2.test();
}
}