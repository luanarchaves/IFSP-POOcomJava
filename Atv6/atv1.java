public class Main
{
    public class Fabricante{
        private String nome;

        public Fabricante(String nome){
            this.nome = nome;
        }    
    }
    
    public class Produto{
        private String nome;
        private String modelo;
        private Fabricante fabricante;
        
        public Produto(String nome, String modelo, Fabricante fabricante){
            this.nome = nome;
            this.modelo = modelo;
            this.fabricante = fabricante;
        }
        
    }
    
	public void main(String[] args) {
		Fabricante logitech = new Fabricante("logitech");
		Fabricante dell = new Fabricante("dell");
		Fabricante samsung = new Fabricante("samsung");
		
		Produto hd = new Produto("hd", "gamer", logitech);
		Produto mouse = new Produto("mouse", "bluetooth", dell);
		Produto teclado = new Produto("teclado", "mini", samsung);
		
		System.out.println("Nome: " + hd.nome + " Modelo: " + hd.modelo + " Fabricante: " + hd.fabricante.nome);

		
	}
}

