import java.util.Scanner;

public class Suma{
  public static void main(String[] args)
{
  Scanner input = new Scanner (System.in);
  System.out.print("Calcu de Sumas");
  System.out.print("Ingrese su primer Numero : ");
  int numero1= input.nextInt(); ///* Asignacion del primer numero a la variable numero1///**
    
  System.out.print("Ingrese su segundo Numero : ");
  int numero2= input.nextInt();  ///** asignacion del segundo numero a la variable numero2///**
  int suma=numero1+numero2;
 
  System.out.println();
  System.out.println("Su suma es = "+suma);
}
}
