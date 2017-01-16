class main1
{
static int p=1;
public static void main(String[] args)
{
p++;
System.out.println("First main");
String[] ar={"a","b"};
if(p==3)
System.exit(0);
else
main(ar);
}
}

class main2
{
public static void main(String[] args)
{
System.out.println("Second main");
for(String p:args)
System.out.println(p);
}
}