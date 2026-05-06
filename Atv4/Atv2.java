import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor 1: ");
		Integer valor1 = leitor.nextInt();
		
		System.out.println("Digite o valor 2: ");
		Integer valor2 = leitor.nextInt();
		
		System.out.println("Digite a operação desejada, opções: +, -, *, /, %, ^x");
		String operacao = leitor.next();
		

		switch(operacao){
		    case "+":
		        System.out.println(df.format(Integer.sum(valor1, valor2)));
		        break;
		    case "-":
		        System.out.println(df.format(Math.subtractExact(valor1, valor2)));
		        break;
		    case "*":
		        System.out.println(df.format(valor1*valor2));
		        break;
		    case "/":
		        System.out.println(df.format(valor1/valor2));
		        break;
		 	case "%":
		        System.out.println(df.format(valor1%valor2));
		        break;
		    case "^x":
		        System.out.println(Math.pow(valor1,valor2));
		        break;
		        
		}
		
	}
}
//LUANA
