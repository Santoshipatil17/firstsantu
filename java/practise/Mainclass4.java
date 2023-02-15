class Sample17
{
int x=10;
}
class Demo extends Sample17
{
void so()
{
System.out.println("hi");
}
}
class Mainclass4
{
public static void main(String[] args)
{
Sample17 d=new Demo();
System.out.println(d.x);
//Sample17 d=(Sample17)new Demo();
}
}