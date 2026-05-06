
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		try{
		    
		    Scanner leitor = new Scanner(System.in);
		    
		    System.out.println("Escreva a altura da parede: ");
		    Integer altura = leitor.nextInt();
		    
		    System.out.println("Escreva a largura da parede: ");
		    Integer largura = leitor.nextInt();
		    
		    //1 metro quadrado = 20 tijolos
		    
		    Integer metro = altura * largura;
		    
		    System.out.println("Serão necessarios " + metro * 20 + " tijolos");
		    
		}catch(Exception e)
		{
		    System.out.println("Erro: " + e);
		    e.printStackTrace();
		}
	}
}

