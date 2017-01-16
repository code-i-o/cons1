class cons10
{
int a,b;

/*cons10(int a,int b)
{		this.a=a;	this.b=b;	}*/
cons10()
{	System.out.println("Cons1");	}

void show()
{	System.out.println(a);System.out.println(b);}
public static void main(String[] args)
{
//new cons10(100,200).show();
cons10 ob=new cons10(100,200);
ob.show();
}
}