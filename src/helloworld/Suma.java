import java.util.Scanner;

public class Suma{
  public static void main(String[] args)
{
  Scanner input = new Scanner (System.in);
System.out.print(""Calcu de Sumas"");
  System.out.print("Ingrese el primer Numero : ");
  int numero1= input.nextInt();
  System.out.print("Ingrese su segundo Numero : ");
  int numero2= input.nextInt();
  int suma=numero1+numero2;
  System.out.println();
  System.out.println("Su suma es = "+suma);
}
}