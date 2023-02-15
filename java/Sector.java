class Sector
{
static void area(int r,double t)
{
double area=(r*r*t)/2;
System.out.println("area of sector is" +area);
}
public static void main(String[] args)
{
area(3,30.5);
}
}