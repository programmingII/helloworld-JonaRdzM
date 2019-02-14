import java.util.Scanner;

public class Ejercicio3_Divi{
public static void main(String[] args)
{
Scanner input= new Scanner (System.in); ///** Scanner sera una variable donde entraras los datos///**

System.out.print("Calculadora de Divisiones\n");
System.out.print("Ingrese su primer Numero : ");
int numero1= input.nextInt();  //** Se guardara el primer numero en la variable numero1//**

System.out.print("Ingrese su segundo Numero : ");
int numero2= input.nextInt();

int divi= (numero1/numero2);

System.out.print("Su Division es : " +divi);
}
}