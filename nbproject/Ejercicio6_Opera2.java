import java.util.Scanner;

public class Ejercicio6_Opera2{
public static void main(String[] args)
{
Scanner input= new Scanner (System.in);
System.out.print("Ingrese su primer numero : ");
int numero1= input.nextInt();
System.out.print("Ingrese su segundo numero : ");
int numero2= input.nextInt();

int suma= numero1+numero2;
int resta= numero1-numero2;
int multi= numero1*numero2;
int divi= numero1/numero2;
int mod= numero1%numero2;

System.out.print(suma+ "\n"+ resta + "\n" + multi+ "\n" + divi + "\n" + mod);
}
}