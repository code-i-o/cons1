class abc
{
abc(int a)
{System.out.println(a);}

}
class cons25 extends abc
{
cons25()
{this(500);System.out.println("cons25");}
cons25(int a)
{ super(a);System.out.println(a);}

public static void main(String[] args)
{
new cons25(20);
}

}