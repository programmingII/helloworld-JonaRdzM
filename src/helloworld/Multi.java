import java.util.Scanner;

public class Multi{

public static void main(String[] args){

Scanner in= new Scanner(System.in);

System.out.print("Ingrese su primero numero a multiplicar : ");
int numero1= in.nextInt();
System.out.print("Ingrese su segundo numero a multiplicar : ");
int numero2= in.nextInt();
int multi= numero1*numero2;

System.out.print("Su multiplicacion es : "+multi);
}
}

