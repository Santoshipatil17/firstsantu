class Demo5
{
int y=10;
static void add(Demo5 d1)
{
System.out.println(d1.y);
}
public static void main(String[] args)
{
Demo5 d=new Demo5();
System.out.println(d.y);
add(d);
}
}