package lojaVarejo;

public class Loja {
	public static void main(String[] args) {
		Produto p[]=new Produto[5];
		p[1]= new Produto();
		p[1].informacoesProduto();
	
	Estoque estoque1= new Estoque();
	estoque1.recebimento(p[1]);
	estoque1.buscaProduto();
	
	
	}
	

}
