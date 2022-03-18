package lojaVarejo;

public class Estoque {
	private Produto produtoRecebido;
	private int quantidadeEstoque;
	private int corredor;
	private String prateleira;
	private String nomeProduto;
	
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Produto getProdutoRecebido() {
		return produtoRecebido;
	}

	public void setProdutoRecebido(Produto produtoRecebido) {
		this.produtoRecebido = produtoRecebido;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getCorredor() {
		return corredor;
	}

	public void setCorredor(int corredor) {
		this.corredor = corredor;
	}

	public String getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(String prateleira) {
		this.prateleira = prateleira;
	}

	public void recebimento(Produto p1) {
	produtoRecebido = p1;
	switch (p1.getNumeroCategoria()) {
	
	case 1 : 
		this.setCorredor(1);
	    this.setPrateleira(" A ");
	    break;
	case 2: 
		this.setCorredor(1);
		this.setPrateleira(" B ");
	    break;
	case 3:
		this.setCorredor(2);
		this.setPrateleira(" A ");
		break;
	case 4:
		this.setCorredor(2);
		this.setPrateleira(" B ");
		break;
	}
	if (this.getQuantidadeEstoque() != 0) {
		this.setQuantidadeEstoque(this.getQuantidadeEstoque()+ (p1.getQuantidadeRecebida()));
	}else {
		this.setQuantidadeEstoque(p1.getQuantidadeRecebida());
	}
	}
	 public void buscaProduto() {
		 this.setNomeProduto(Teclado.leString("Digite o nome do produto que está procurando: "));
		 if ( this.getNomeProduto() .equals(this.produtoRecebido.getNome()) ) {
			 System.out.println("O produto está na prateleira "+ this.getPrateleira());
			 System.out.println("E está no corredor "+ this.getCorredor());
			 System.out.println("Quantidade em estoque:  " + this.getQuantidadeEstoque());
			 System.out.println("Valor de venda: " + produtoRecebido.getPreco());
		 }
		 
			
				 
				 
		 
	 }
}
