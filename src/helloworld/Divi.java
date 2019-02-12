import java.util.Scanner;

public class Divi{
public static void main(String[] args)
{
Scanner input = new Scanner (System.in); //** Scanner sera de entrada de datos///**
  
System.out.print("Ingrese su primer numero : ");
int numero1= input.nextInt(); //** se asigna el primer numero a la variable numero1//**
System.out.print("Ingrese su segundo numero : ");  ///**Segundo numero///*
int numero2= input.nextInt(); //** se asigna el segundo numero///**
  
int divi= (numero1/numero2);

System.out.print("Su multiplicacion es : " +divi);
}
}
