class Sample
{
int x=10;
}
class  Demo extends Sample
{
void test()
{
System.out.println("hey its test..");
}
}
class Mainclass1
{
public static void main(String[] args)
{
Demo d1=new Demo();
d1.test();
System.out.println(d1.x);
}
}