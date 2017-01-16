class abc
{
abc(){System.out.println("abc");}
abc(int a)
{System.out.println(a);}
}
class cons22 extends abc
{
cons22()
{System.out.println("cons22");}
cons22(int a)
{super(a); System.out.println(a);}

public static void main(String[] args)
{
new cons22(100);
}

}