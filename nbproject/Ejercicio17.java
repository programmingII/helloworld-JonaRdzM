import java.util.Scanner;
public class Ejercicio17 {
public static void main(String[] args)
{
long numbina1, numbina2;
int i=0, residuo=0;
int[] suma= new int[20];
Scanner in = new Scanner (System.in);

System.out.print("Ingrese su primer numero binario a sumar : ");
numbina1= in.nextLong();
System.out.print("Ingrese su segundo numero binario a sumar : ");
numbina2= in.nextLong();

while (numbina1 != 0 || numbina2 !=0)
{
suma[i++] = (int)((numbina1 % 10 + numbina2 % 10 + residuo) % 2);
residuo = (int)((numbina1 %10 + numbina2 % 10 + residuo) / 2);
numbina1= numbina1 / 10;
numbina2= numbina2 / 10;
}
if (residuo !=0){
suma[i++] = residuo;
}
--i;
System.out.print(" Su suma de los dos numeros es : ");
while(i >= 0) {
System.out.print(suma[i--]);
}
System.out.print("\n");
}
}