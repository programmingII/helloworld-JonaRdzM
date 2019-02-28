import java.util.Scanner;
public class Ejercicio38 {
    
public static void main(String[] args) {

String oracion = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
count(oracion);
}
public static void count(String testeo){
char[] cadena = testeo.toCharArray();
int letras = 0;
int espacios = 0;
int numeros = 0;
int otroscaracteres = 0;
for(int i = 0; i < testeo.length(); i++){

if(Character.isLetter(cadena[i])){
letras ++ ;
}

else if(Character.isDigit(cadena[i])){
numeros ++ ;
}

else if(Character.isSpaceChar(cadena[i])){
espacios ++ ;
}

else{
otroscaracteres ++;

}
}

System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
System.out.println("letras: " + letras);
System.out.println("espacios: " + espacios);
System.out.println("numeros: " + numeros);
System.out.println("otros caracteres: " + otroscaracteres);
}
}