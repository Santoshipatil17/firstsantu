class Demo
{
int x=10;
static void add(Demo d1)
{
System.out.println(d1.x);
}
public static void main(String[] args)
{
Demo d=new Demo();
System.out.println(d.x);
add(d);
}
}