import java.util.Scanner;

public class Ejercicio7_Tabla
{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);

System.out.print("Ingrese su el numero para la Tabla de multiplicar : " );
int numero1= input.nextInt();

for(int i=0; i<11; i++){
System.out.println(numero1+" X "+i+"= "+i*numero1);
}
}
}