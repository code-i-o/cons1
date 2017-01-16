class abc
{
abc(int a)
{System.out.println(a);}

}
class cons20 extends abc
{
cons20()
{super(10);System.out.println("cons20");}
cons20(int a)
{super(a); System.out.println(a);}

public static void main(String[] args)
{
new cons20(100);
new cons20();
}
}