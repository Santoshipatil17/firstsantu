abstract class Sample
{
abstract void cool();
abstract void test();
}
class Demo1 extends Sample
{
void cool()
{
System.out.println("hi");
}
void test()
{
System.out.println("hello");
}
}
class Mainclass
{
public static void main(String[] args)
{
Demo1 d1=new Demo1();
d1.cool();
d1.test();
}
}