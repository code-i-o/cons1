class abc
{
abc(int a)
{System.out.println(a);}

}
class cons23 extends abc
{
cons23()
{super(10);System.out.println("cons23");}
cons23(int a)
{ System.out.println(a);super(100);}

public static void main(String[] args)
{
new cons23(100);
}

}