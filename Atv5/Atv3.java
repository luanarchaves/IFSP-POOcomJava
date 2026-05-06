import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main
{
    public static void Imprimir(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String mensagem = leitor.nextLine();
		Imprimir(mensagem);
	}
}

