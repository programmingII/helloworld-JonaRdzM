import java.nio.charset.Charset;

public class Ejercicio40 {

public static void main(String[] args) {

System.out.println("Lista de caracteres disponibles: "); 
 
for (String str : Charset.availableCharsets().keySet()) {

System.out.println(str);
}
}
}