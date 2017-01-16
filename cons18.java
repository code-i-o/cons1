class abc
{
abc(int a)
{System.out.println(a);}

}
class cons18 extends abc
{
cons18()
{super(100);System.out.println("cons18");}

public static void main(String[] args)
{
new cons18();
}

}