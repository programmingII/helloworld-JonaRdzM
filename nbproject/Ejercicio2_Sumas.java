import java.util.Scanner;

public class Ejercicio2_Sumas{

public static void main(String[] args)
{

Scanner input= new Scanner (System.in);
System.out.print("Calculadora de Sumas\n");
System.out.print("Ingrese su primer Numero : ");
int numero1= input.nextInt();  //** Aqui asignamos el primer numero a la variable entera "Numero1"//**
System.out.print("Ingrese su segundo Numero : ");
int numero2= input.nextInt();  ///** Asignacion del segundo numero en variable entera///**

int suma= numero1+numero2;
System.out.println("Su suma es = "+suma);
}
}