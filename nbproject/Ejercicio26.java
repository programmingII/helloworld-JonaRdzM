import java.util.Scanner;

public class Ejercicio26 {
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int[] valoresoctales = {0, 1, 10, 11, 100, 101, 110, 111};
long numerooctal, numerooctaltemporal, numerobinario, espacio;
int residuo;
System.out.print("Ingrese cualquier numero octal: ");
numerooctal = in.nextLong();
numerooctaltemporal = numerooctal;
numerobinario = 0;
espacio= 1;
while (numerooctaltemporal != 0)
{
residuo = (int)(numerooctaltemporal % 10);
numerobinario = valoresoctales[residuo] * espacio+ numerobinario;
numerooctaltemporal /= 10;
espacio*= 1000;
}
System.out.print("Su numero equivalente a biario es : " +numerobinario+"\n");
}
}