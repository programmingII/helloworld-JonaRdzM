import java.util.Scanner;
public class Ejercicio19 {
      public static void main(String args[])
    {
        int numerodecimal, remanente, cociente, i=1, j;
        int numerobinario[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Ingrese su numero decimal : ");
        numerodecimal = scan.nextInt();
		
        cociente = numerodecimal;
		
        while(cociente != 0)
        {
            numerobinario[i++] = cociente%2;
            cociente = cociente/2;
        }
		
        System.out.print("Su numero binario es: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(numerobinario[j]);
        }
        System.out.print("\n");
    }
}