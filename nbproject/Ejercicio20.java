import java.util.Scanner;
public class Ejercicio20{
public static void main(String[] args)
{
int numerodecimal, remanente;
String numerohexadecimal="";  //** digitos del numero hexadecimal

char hexadecimal[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner in= new Scanner(System.in);

System.out.print("Ingrese su numero decimal: ");
numerodecimal= in.nextInt();

while(numerodecimal>0)
{
remanente= numerodecimal%16;
numerohexadecimal= hexadecimal[remanente] + numerohexadecimal;
numerodecimal= numerodecimal/16;
}
System.out.print("Su numero hexadecimal es : " +numerohexadecimal);
}
}