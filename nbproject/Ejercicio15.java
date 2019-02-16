import java.util.Scanner;
public class Ejercicio15{
public static void main(String[] args){

int x,y,z;
Scanner in= new Scanner(System.in);

System.out.println("Ingrese su primer numero : ");
x=in.nextInt();
System.out.println("Ingrese su segundo numero : ");
y=in.nextInt();

z=x;
x=y;
y=z;
System.out.println("El intercambio de Variables es : "+x+" y " + y);
}
}