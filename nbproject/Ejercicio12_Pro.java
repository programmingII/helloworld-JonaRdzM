import java.util.Scanner; ///*** Importamos la libreria Scanner de java que nos servira para poder leer datos desde el teclado////**

public class Ejercicio12_Pro ////** creamos la clase y el nombre del programa///**
{
public static void main(String[] args)   ///** aqui se crea el main del programa con todos sus atributos///**
{
Scanner input= new Scanner(System.in);   ////*** se crea el new Scanner para poder introducir teclado desde el teclado///**

System.out.print("Ingrese tres numero para sacar el promedio de ellos: ");  ////** mandamos a imprimir el mensaje para los numeros///*
int numero1= input.nextInt();                            /////** aqui guardamos los numeros en las variables, en cada una de ellas///**
int numero2= input.nextInt();
int numero3= input.nextInt();

float promedio= (numero1+numero2+numero3)/3;    /////** sacamaos el promedio de los tres numeros///**
System.out.print("Su promedio es = "+promedio);/////*** mandamos a imprimir el promedio de los 3 numeros, su suma y su division entre ellos//*
}
}
