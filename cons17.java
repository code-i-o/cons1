class abc
{
abc(int a)
{
a=100;
System.out.println(a);
}
}
class cons17 extends abc
{
cons17(int a)
{System.out.println("cons17");}

public static void main(String[] args)
{
new cons17(12);
}

}