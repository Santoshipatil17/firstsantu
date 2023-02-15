class Sample1
{
static void area()
{
final double pi=3.14;
int r=4;
double result=pi*r*r;
System.out.println(result);
}
}
class Triangle
{
public static void main(String[] args)
{
Sample1.area();
}
}