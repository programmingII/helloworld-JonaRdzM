public class Ejercicio13_Tri
{
private static final double altura=8.5;
private static final double ancho= 5.6;

public static void main(String[] args)
{

double perimetro= 2*(altura+ancho);
double area= altura*ancho;
System.out.println("Area y Perimetro de un Rectangulo");
System.out.println("Su altura es : "+altura);
System.out.println("Su ancho es : "+ancho);
System.out.printf("El perimetro es 2*(%.1f+%.1f) = %.2f \n", altura, ancho, perimetro);
System.out.printf("Su area es %.1f* %.1f = %.2f \n",ancho,altura,area);
}
}


