import java.util.Scanner;
public class Ejercicio18 {

 public static void main(String[] args)
 {
  long binario1, binario2, multi = 0;
  int digito, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Ingrese su primer numero Binario: ");
  binario1 = in.nextLong();
  System.out.print("Ingrese su segundo numero Binario: ");
  binario2 = in.nextLong();
  while (binario2 != 0)
  {
   digito = (int)(binario2 % 10);
   if (digito == 1) 
   {
    binario1 = binario1 * factor;
    multi = binarioproducto((int) binario1, (int) multi);
   } 
   else
   {
    binario1 = binario1 * factor;
   }
   binario2 = binario2 / 10;
   factor = 10;
  }
  System.out.print("Resultado producto de dos Binarios: " + multi+"\n");
 }
 static int binarioproducto(int binario1, int binario2) 
 {
  int i = 0, residuo = 0;
  int[] suma= new int[20];
  int binario_producto_resultado = 0;

  while (binario1 != 0 || binario2 != 0) 
  {
   suma[i++] = (binario1 % 10 + binario2 % 10 + residuo) % 2;
   residuo= (binario1 % 10 + binario2 % 10 + residuo) / 2;
   binario1 = binario1 / 10;
   binario2 = binario2 / 10;
  }
  if (residuo != 0)
  {
   suma[i++] = residuo;
  }
  --i;
  while (i >= 0) 
  {
   binario_producto_resultado = binario_producto_resultado * 10 + suma[i--];
  }
  return binario_producto_resultado;
 }
 }