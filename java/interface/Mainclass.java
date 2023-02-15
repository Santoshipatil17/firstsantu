interface Sample
{
void cool();
void disp();
}
class Driver implements Sample
{
public void cool()
{
System.out.println("ho");
}
public void disp()
{
System.out.println("hi");
}
}
class Mainclass
{
public static void main(String[] args)
{
Driver d=new Driver();
d.cool();
d.disp();
}
}