import java.util.Scanner;

public class Ejercicio12_Pro
{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);

System.out.print("Ingrese tres numero para sacar el promedio de ellos: ");
int numero1= input.nextInt();
int numero2= input.nextInt();
int numero3= input.nextInt();

float promedio= (numero1+numero2+numero3)/3;
System.out.print("Su promedio es = "+promedio);
}
}