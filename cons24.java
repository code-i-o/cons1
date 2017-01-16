class abc
{
abc(int a)
{	System.out.println(a); }
}
class cons24 extends abc
{
cons24()
{
	this(500);	System.out.println("cons24");
}
cons24(int a)
{ 
	super(a);	System.out.println(a);
}
public static void main(String[] args)
{
new cons24();
}

}