class Whatsapp1
{
void status()
{
System.out.println("only text");
}
}
class Whatsapp2 extends Whatsapp1
{
void status()
{
System.out.println("text with image");
super.status();
}
}
class Mainclass3
{
public static void main(String[] args)
{
Whatsapp2 v=new Whatsapp2();
v.status();
}
}