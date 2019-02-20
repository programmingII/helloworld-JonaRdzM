import java.util.Scanner;
public class Ejercicio23 {
 public static void main(String[] args) 
 {
  int[] hexa = new int[1000];
  int i = 1, j = 0, residuo, deci = 0, bina;
  Scanner in = new Scanner(System.in);
  System.out.print("Ingrese su numero binario: ");
  bina = in.nextInt();
  while (bina > 0) {
   residuo = bina % 2;
   deci = deci + residuo * i;
   i = i * 2;
   bina = bina / 10;
  }
   i = 0;
  while (deci != 0) {
   hexa[i] = deci % 16;
   deci = deci / 16;
   i++;
  }
  System.out.print("Numero hexadecimal es : ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hexa[j] > 9) 
   {
    System.out.print((char)(hexa[j] + 55)+"\n");
   } else
   {
    System.out.print(hexa[j]);
   }
  }
 }
}