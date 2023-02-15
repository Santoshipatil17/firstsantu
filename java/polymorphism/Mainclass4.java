class Man
{
void act()
{
System.out.println("some act");
}
}
class Father extends Man
{
void act()
{
System.out.println("some act");
}
}
class Brother extends Man
{
void act()
{
System.out.println("some act");
}
}
class Husband extends Man
{
void act()
{
System.out.println("some act");
}
}
class Stimulator
{
static void act(Man b)
{
b.act();
}
}
class Mainclass4
{
public static void main(String[] args)
{
Father f=new Father();
Brother b=new Brother();
Husband h =new Husband();
Stimulator.movie(f);
Stimulator.movie(b);
Stimulator.movie(h);
}
}