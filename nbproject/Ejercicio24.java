import java.util.Scanner;
public class Ejercicio24 {
public static void main(String[] args) 
{
int numerobinario, numerobinario1,residuo, decimal=0, cociente, i=1, j;
int numerooctal[] = new int[100];
Scanner in = new Scanner(System.in);
System.out.print("Ingrese su numero binario : ");
numerobinario = in.nextInt();
numerobinario1=numerobinario;
     
while(numerobinario > 0)
{
residuo = numerobinario % 10;
decimal = decimal + residuo*i;
//System.out.println(rem);
            i = i*2;
            numerobinario = numerobinario/10;
        }   

		i=1;
        cociente = decimal;
		
        while(cociente > 0)
        {
            numerooctal[i++] = cociente% 8;
            cociente = cociente/ 8;
        }
		
        System.out.print("Su equivalente a octal de " +numerobinario1+ " es :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(numerooctal[j]);
        }

 
    }
}