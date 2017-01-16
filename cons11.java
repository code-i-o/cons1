class cons11
{
int a,b;

cons11(int a,int b)
{this();	this.a=a;	this.b=b;	}

cons11()
{	System.out.println("Cons1");	}

void show()
{	System.out.println(a);System.out.println(b);}

public static void main(String[] args)
{
new cons11(100,200).show();
}

}