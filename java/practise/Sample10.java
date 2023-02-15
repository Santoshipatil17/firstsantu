class Sample10
{
double area()
{
int r=8;
final double pi=3.142;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
Sample10 s=new Sample10();
double x=s.area();
System.out.println(x);
}
}