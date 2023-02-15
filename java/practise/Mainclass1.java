class Whatsapp
{
static void send(int no)
{
System.out.println("sending no");
}
static void send(int no,String text)
{
System.out.println("sending no and text");
}
}
class Mainclass1
{
public static void main(String[] args)
{
Whatsapp.send(12);
Whatsapp.send(12,"we");
}
}