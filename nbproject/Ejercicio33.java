import java.util.Scanner;
public class Ejercicio33 { 

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Ingrese su numero entero: ");
long entero = input.nextLong();
System.out.println("La suma de los digitos del entero es : " + sumadigitos(entero));

}
public static int sumadigitos(long entero) {
int suma = 0;
while (entero != 0) {
suma += entero % 10;
entero /= 10;
}
return suma;
}
}