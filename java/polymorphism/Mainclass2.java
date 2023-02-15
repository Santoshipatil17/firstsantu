class Jspider
{
void work()
{
System.out.println("some sound");
}
}
class Counceller extends Jspider
{
void work()
{
System.out.println("details");
}
}
class Trainer extends Vehicle
{
void work()
{
System.out.println("teach");
}
}
class Student extends Jspider
{
void work()
{
System.out.println("study");
}
}
class Stimulator
{
static void work(Jspider j)
{
j.work();
}
}
class Mainclass1
{
public static void main(String[] args)
{
Counceller c=new Conceller();
Trainer t=new Trainer();
Studenr s a=new Student();
Stimulator.work(c);
Stimulator.work(t);
Stimulator.work(s);
}
}