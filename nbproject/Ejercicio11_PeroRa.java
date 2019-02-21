public class Ejercicio11_PeroRa   ///** Aqui creamos la clase del programa, que calculara el perimetro y area de un circulo///**
{
private static final double radio=7.5;   ///** aqui declaramos el radio como statico y que no cambia su valor en todo el programa///**

public static void main(String[] args)////** cuerpo del programa con su main y en el sus atributos y funciones dentro///**
{
double Perimetro= 2* Math.PI*radio;////** declaramos el valor del perimetro con la formula matematica y la libreria Math que tiene defenido el valor de PI//*
double area= Math.PI*radio*radio; ///** lo mismo con el radio///**
System.out.println("Su radio por defecto es = "+radio);////** mandamos llamar la variable radio para que imprima su valor///**
System.out.println("El perimetro es = " +Perimetro);///** aqui imprimimos el prerimetro//**
System.out.println("Su area es = "+area);///** imprimimos el area//**
}
}
