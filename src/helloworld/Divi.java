import java.util.Scanner;

public class Divi{
public static void main(String[] args)
{
Scanner input = new Scanner (System.in);
System.out.print("Ingrese su primer numero : ");
int numero1= input.nextInt();
System.out.print("Ingrese su segundo numero : ");
int numero2= input.nextInt();
int divi= (numero1/numero2);

System.out.print("Su multiplicacion es : " +divi);
}
}