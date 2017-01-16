class abc
{
abc(int a)
{System.out.println(a);}
}
class cons19 extends abc
{
cons19()
{System.out.println("cons19");}
cons19(int a)
{super(a);System.out.println(a);}

public static void main(String[] args)
{
new cons19(100);
}

}