import java.util.Scanner;
public class Main
{
    public static void CompararNumeros(Integer num1, Integer num2){
        System.out.print("O valor "+Math.max(num1, num2)+" é o maior");
    }
    
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Integer num1 = leitor.nextInt();
		Integer num2 = leitor.nextInt();
		CompararNumeros(num1, num2);
	}
}

