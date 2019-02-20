import java.util.Scanner;
public class Ejercicio22{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
long numerobinario, numerodecimal=0, j=1, residuo;
System.out.print(" Ingrese su numero binario a convertir en decimal : " );
numerobinario= in.nextLong();

while(numerobinario!=0)
{
residuo=numerobinario %10;
numerodecimal= numerodecimal+residuo*j;
j=j*2;
numerobinario=numerobinario/10;
}
System.out.println("Su numero decimal es : "+ numerodecimal);
}
}