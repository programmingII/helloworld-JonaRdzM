import java.util.Scanner;

public class Ejercicio25 {
 
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
long numerooctal, numerodecimal = 0;
int i = 0;
System.out.print("Ingrese su numero octal: ");
numerooctal = in.nextLong();
while (numerooctal != 0) 
{
numerodecimal = (long)(numerodecimal + (numerooctal % 10) * Math.pow(8, i++));
numerooctal = numerooctal / 10;
}
System.out.print("Su numero equivalente a decimal es : " + numerodecimal+"\n");
}
}