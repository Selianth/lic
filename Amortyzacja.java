import java.util.Scanner;
class Amortyzacja
{
public static void main(String arg[])
{
long warto��,umorzenieprocent,lata,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Wprowad� warto�� pocz�tkow� �rodka trwa�ego");
warto��=sc.nextLong();
System.out.println("Wprowad� procentow� amortyzacj�");
umorzenieprocent=sc.nextLong();
System.out.println("Wprowad� okres u�ytkowania(w latach)");
lata=sc.nextLong();
temp=warto��;
for(int i=0;i<lata;i++)
temp=((100-umorzenieprocent)*temp)/100;
System.out.println("Warto�� po okresie u�ytkowania= "+temp);
}
}