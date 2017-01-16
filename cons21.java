class abc
{
abc(int a)
{System.out.println(a);}

}
class cons21 extends abc
{
cons21()
{super(10);put();System.out.println("cons21");}
cons21(int a)
{super(a); System.out.println(a);}

public static void main(String[] args)
{
new cons21(100);
}

}