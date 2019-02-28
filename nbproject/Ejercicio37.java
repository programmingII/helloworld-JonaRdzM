import java.util.Scanner;
public class Ejercicio37 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese su oracion: ");

char[] letras = scanner.nextLine().toCharArray();

System.out.print("Su oracion al reverso es: ");

for (int i = letras.length - 1; i >= 0; i--) {
System.out.print(letras[i]);
}
}
}