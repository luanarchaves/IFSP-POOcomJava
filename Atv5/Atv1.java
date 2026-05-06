import java.util.Scanner;
public class Main
{
    public static void SayHello(String nome){
        System.out.println("Olá " + nome + " como voce esta?");
    }
    
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nomeUser = leitor.nextLine();
		SayHello(nomeUser);
	}
}

