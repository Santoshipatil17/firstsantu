class Sample18
{
Sample18()
{
System.out.println("constructor");
}
}
static
{
System.out.println("sib");
}
{
System.out.println("iib");
}
public static void main(String[] args)
{
new Sample18();
System.out.println("starts");
}
}