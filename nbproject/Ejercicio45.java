import java.util.Scanner;
import java.io.File;

public class Ejercicio45 {

public static void main(String[] args) {

System.out.println("/equipo/escritorio/jona.txt  : " + new File("jona.txt").length() + " bytes");
System.out.println("/equipo/escritorio/luis.txt : " + new File("luis.txt").length() + " bytes");
}
}