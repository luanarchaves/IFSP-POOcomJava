import java.util.Scanner;
public class Main
{
    public static void DiaSemana(Integer num){
        String [] diaSemana = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira", "Sábado","Domingo"};
        System.out.print(diaSemana[num-1]);
        
    }
    
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Integer diaSemana = leitor.nextInt();
		DiaSemana(diaSemana);
	}
}
