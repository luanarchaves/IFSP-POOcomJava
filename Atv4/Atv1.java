import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		Integer valor1 = leitor.nextInt();
		
		System.out.println("Digite o valor 2: ");
		Integer valor2 = leitor.nextInt();
		
		for (Integer i = valor1; i <= valor2; i++){
		    System.out.println(i);
		}
		
	}
}
//LUANA
