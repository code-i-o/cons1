class cons13
{
int a,b;
cons13(int a,int b)
{this(a); this.a=a;	this.b=b;	}
cons13(int a)
{this();	System.out.println(this.a);}
cons13()
{	System.out.println("Cons1");	}

void show()
{	System.out.println(a);System.out.println(b);}
public static void main(String[] args)
{
new cons13(100,200).show();
}

}