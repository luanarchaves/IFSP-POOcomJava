import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		List<String> doces = Arrays.asList("Bolo","Chocolate","Sorvete","Bolacha","Cereal");
		List<String> perguntas = Arrays.asList("Qual seu doce favorito?","Qual doce é melhor é frio? ","Qual doce comer no café da manhã?");


            for (String pergunta : perguntas){
                System.out.println(pergunta);
        		String comidaCliente = leitor.next();
        
        		for (String comida : doces) {
        			if (comidaCliente.equals(comida)) {
        				System.out.println("Eu adoro "+comida);
        			}

        		}
            }
        

	}
}
//LUANA
