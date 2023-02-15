class Bookmyshow
{
void movie()
{
System.out.println("some movie");
}
}
class Sandalwood extends Bookmyshow
{
void movie()
{
System.out.println("some movie");
}
}
class Bollywood extends Bookmyshow
{
void movie()
{
System.out.println("some movie");
}
}
class Hollywood extends Bookmyshow
{
void movie()
{
System.out.println("some movie");
}
}
class Stimulator
{
static void movie(Bookmyshow b)
{
b.movie();
}
}
class Mainclass3
{
public static void main(String[] args)
{
Sandalwood s=new Sandalwood();
Bollywood b=new Bollywood();
Hollywood hs a=new Hollywood();
Stimulator.movie(s);
Stimulator.movie(h);
Stimulator.movie(b);
}
}