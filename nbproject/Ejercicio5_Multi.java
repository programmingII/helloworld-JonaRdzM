import java.util.Scanner;

public class Ejercicio5_Multi{

public static void main(String[] args)
{

Scanner in= new Scanner(System.in);

System.out.print("Calculadora de multiplicacion\n");
System.out.print("Ingrese su primer numero : ");
int numero1= in.nextInt();
System.out.print("Ingrese su segundo numero : ");
int numero2 = in.nextInt();

int multi= numero1*numero2;

System.out.print("Su multiplicacion es: "+multi);
}
}