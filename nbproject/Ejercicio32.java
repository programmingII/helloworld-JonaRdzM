import java.util.Scanner;

public class Ejercicio32 {

public static void main( String[] args ) 
{
    
Scanner input = new Scanner(System.in);
int numero1;        
int numero2;   
      
System.out.print( "Ingrese su primer numero : " );       
numero1 = input.nextInt();
 
System.out.print( "Ingrese su segundo numero : " );        
numero2 = input.nextInt();              
        
if ( numero1 == numero2 )           
System.out.printf( "%d == %d\n", numero1, numero2 );  
if ( numero1 != numero2 )          
System.out.printf( "%d != %d\n", numero1, numero2 );  
if ( numero1 < numero2 )          
System.out.printf( "%d < %d\n", numero1, numero2 );  
if ( numero1 > numero2 )          
System.out.printf( "%d > %d\n", numero1, numero2 );  
if ( numero1 <= numero2 )          
System.out.printf( "%d <= %d\n", numero1, numero2 );  
if ( numero1 >= numero2 )          
System.out.printf( "%d >= %d\n", numero1, numero2 );  
}
}