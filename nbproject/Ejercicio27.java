import java.util.Scanner;

public class Ejercicio27 {
public static void main(String args[])
{
String numerooctal, numerohexadecimal;
int numerodecimal;
Scanner in = new Scanner(System.in);
		
System.out.print("Ingrese su numero octal: ");
numerooctal = in.nextLine();
	
numerodecimal = Integer.parseInt(numerooctal, 8);
numerohexadecimal = Integer.toHexString(numerodecimal);
		
System.out.print("Numero hexadecimal equivalente es: "+ numerohexadecimal+"\n");
}
}