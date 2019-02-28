import java.util.Scanner;

public class Ejercicio36 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Ingrese la latitud de la coordenada 1: ");
double latitud1 = input.nextDouble();

System.out.print("Ingrese la longitud de la coordenada 1: ");
double longitud1 = input.nextDouble();

System.out.print("Iingrese la latitud de la coordenada 2: ");
double latitud2 = input.nextDouble();

System.out.print("Ingrese la longitud de la coordenada 2: ");
double longitud2 = input.nextDouble();

System.out.print("La distancia entre sus puntos es : " + distancialongitud(latitud1, longitud1, latitud2, longitud2) + " km\n");
}

public static double distancialongitud(double latitud1, double longitud1, double latitud2, double longitud2) {
latitud1 = Math.toRadians(latitud1);
longitud1 = Math.toRadians(longitud1);
latitud2 = Math.toRadians(latitud2);
longitud2 = Math.toRadians(longitud2);

double radiotierra = 6371.01; 
return radiotierra * Math.acos(Math.sin(latitud1)*Math.sin(latitud2) + Math.cos(latitud1)*Math.cos(latitud2)*Math.cos(longitud1 - longitud2));
}
}
