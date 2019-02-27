import java.util.Scanner;

public class Ejercicio35 {
    
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Ingrese el numero de lados de su poligono: ");
int numlados = input.nextInt();

System.out.print("Ingrese la longitud de uno de los lados del poligono: ");
double longila = input.nextDouble();
System.out.print("Su area es : " + areapoli(numlados, longila)+"\n");

}
public static double areapoli(int numlados, double longila) {

return (numlados * (longila * longila)) / (4.0 * Math.tan((Math.PI / numlados)));

}
}