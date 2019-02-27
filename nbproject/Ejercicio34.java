import java.util.Scanner;

public class Ejercicio34 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Ingrese la longitud de un lado del hexagono: ");
double lado = input.nextDouble();
System.out.print("El area de su hexagono es : " + areahexa(lado)+"\n");
}
public static double areahexa(double lado) {
return (6*(lado*lado))/(4*Math.tan(Math.PI/6));
}
}