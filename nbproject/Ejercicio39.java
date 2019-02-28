import java.util.Scanner;

public class Ejercicio39 {
    
public static void main(String[] args) {

int contador = 0;
for(int i = 1; i <= 4; i++){
for(int j = 1; j <= 4; j++){
for(int k = 1; k <= 4; k++){
if(k != i && k != j && i != j){
contador++;
System.out.println(i + "" + j + "" + k);
}
}
}
}
System.out.println("Numero total de numeros de tres digitos son  " + contador);
}
}