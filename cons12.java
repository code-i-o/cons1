class cons12
{
int a,b;

cons12(int a,int b)
{this.a=a;	this.b=b;	this();}

cons12()
{	System.out.println("Cons1");	}

void show()
{	System.out.println(a);System.out.println(b);}

public static void main(String[] args)
{
new cons12(11,22).show();
}

}