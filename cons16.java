class abc
{
abc()
{System.out.println("abc");}

}
class cons16 extends abc
{
cons16()
{super();System.out.println("cons16");}

public static void main(String[] args)
{
new cons16();
}

}