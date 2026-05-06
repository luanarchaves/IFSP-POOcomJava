
package luana;


import javax.swing.JOptionPane;
public class Luana
{
	public static void main(String[] args) {
            try{

                String altura = JOptionPane.showInputDialog(null,"Escreva a altura da parede: ","Luana",3);

                String largura = JOptionPane.showInputDialog(null,"Escreva a largura da parede: ","Luana",3);

                Integer metro = (Integer.parseInt(altura) * Integer.parseInt(largura)) * 20;

                
                if (Integer.parseInt(altura) < 3){
                    JOptionPane.showMessageDialog(null, "A parede é baixa em altura", "Luana",3); 
                }else if (Integer.parseInt(altura) >= 3 && Integer.parseInt(altura) <= 4){
                    JOptionPane.showMessageDialog(null, "A parede é média em altura", "Luana",3); 
                }else{
                    JOptionPane.showMessageDialog(null, "A parede é alta em altura", "Luana",3); 
                }
                
                JOptionPane.showMessageDialog(null, "Serão necessarios " + metro + " tijolos", "Luana",3); 
                    

            }catch(Exception e)
            {
                System.out.println("Erro: " + e);
                e.printStackTrace();
            }
	}
}
