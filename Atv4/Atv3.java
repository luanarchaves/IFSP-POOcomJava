import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    List<Character> vogais = Arrays.asList('a','e','i','o','u');

	    String texto = leitor.next();
	    
	    for (Character letra : vogais){
	        for (int i = 0; i <= texto.length(); i++){
	            Character letraTexto = texto.charAt(i);
    	        if (!letraTexto.equals(letra)){
    	            System.out.println(texto.charAt(i));
    	        }
	        }
	    }
	
	}
}
//LUANA
