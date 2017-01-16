class cons9
{
int a,b;

cons9(int a,int b)
{	show();	this.a=a;	this.b=b;	}

{	show();	a=10;	b=20;	}

void show()
{	System.out.println(a);System.out.println(b);}

public static void main(String[] args)
{
new cons9(100,200).show();
}

}