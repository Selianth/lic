import java.util.Scanner;
class Amortyzacja
{
public static void main(String arg[])
{
long wartoœæ,umorzenieprocent,lata,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Wprowad¿ wartoœæ pocz¹tkow¹ œrodka trwa³ego");
wartoœæ=sc.nextLong();
System.out.println("WprowadŸ procentow¹ amortyzacjê");
umorzenieprocent=sc.nextLong();
System.out.println("WprowadŸ okres u¿ytkowania(w latach)");
lata=sc.nextLong();
temp=wartoœæ;
for(int i=0;i<lata;i++)
temp=((100-umorzenieprocent)*temp)/100;
System.out.println("Wartoœæ po okresie u¿ytkowania= "+temp);
}
}