class Animal
{
void noise()
{
System.out.println("some noise");
}
}
class Snake extends Animal
{
void noise()
{
System.out.println("aa");
}
}
class Dog extends Animal
{
void noise()
{
System.out.println("bb");
}
}
class Cat extends Animal
{
void noise()
{
System.out.println("bb");
}
}
class Stimulator
{
static void noise(Animal a)
{
a.noise();
}
}
class Mainclass5
{
public static void main(String[] args)
{
Snake s=new Snake();
Dog d=new Dog();
Cat c =new Cat();
Stimulator.noise(s);
Stimulator.noise(d);
Stimulator.noise(c);
}
}