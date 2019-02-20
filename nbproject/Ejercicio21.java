import java.util.Scanner;
public class Ejercicio21{
public static void main(String[] args)
{
int numerodecimal, remanente, cociente, i=1,j;
int numerooctal[]= new int[100];
Scanner in= new Scanner(System.in);

System.out.print("Ingrese su numero decimal a convertir en octal : ");
numerodecimal= in.nextInt();

cociente= numerodecimal;

while(cociente !=0)
{
numerooctal[i++] = cociente%8;
cociente=cociente/8;
}

System.out.print("Su numero octal es: " );
for(j=i-1; j>0; j--)
{
System.out.print(numerooctal[j]);
}
}}