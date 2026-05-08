import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main
{
    public static void Imprimir(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    public static void DiaSemana(Integer num){
        String [] diaSemana = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira", "Sábado","Domingo"};
        System.out.print(diaSemana[num-1]);
        
    }
    
    public static void DiaSemana(Integer num, Integer opcao){
        String [] diaSemana = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira", "Sábado","Domingo"};
        Imprimir(diaSemana[num-1]);
    }
    
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual dia da semana? ");
		Integer diaSemana = leitor.nextInt();
		
		
		System.out.println("Qual opção? 1 texto e 2 gráfico");
		Integer opcao = leitor.nextInt();
		
		if (opcao == 1){
		    DiaSemana(diaSemana);
		}else if (opcao == 2){
		    DiaSemana(diaSemana, opcao);
		}
		
		
	}
}

