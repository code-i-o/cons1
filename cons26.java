class abc
{
abc(int a)
{System.out.println(a);}

}
class cons26 extends abc
{
cons26()
{super(500);System.out.println("cons26");}
cons26(int a)
{ super(a);System.out.println(a);}

public static void main(String[] args)
{
new cons26(100);
}

}