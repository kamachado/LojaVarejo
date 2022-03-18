package lojaVarejo;

public class Produto {
	private String nome;
	private int numeroCategoria;
	private String categoria;
	private double preco;
	private int quantidadeRecebida;
	private String fornecedor;
	private double precoFornecedor;

	public Produto() {
		System.out.println("------------ Registro de produto recebido ------------");
		this.setNome(Teclado.leString("Digite o nome do produto: "));
		System.out.println("Escolha a categoria do produto ");
		System.out.println("[1] Brinquedo");
		System.out.println("[2] Utensílio doméstico");
		System.out.println("[3] Jardim");
		System.out.println("[4] vestuário");

		while (this.getNumeroCategoria() >= 5 || this.getNumeroCategoria() == 0) {
			this.setNumeroCategoria(Teclado.leInt("Digite o número da categoria que deseja registrar "));
			switch (this.getNumeroCategoria()) {
			case 1:
				this.setCategoria("Brinquedo");
				break;
			case 2:
				this.setCategoria("utensílio doméstico");
				break;
			case 3:
				this.setCategoria("Jardim");
				break;
			case 4:
				this.setCategoria("vestuário");
				break;
			default:
				System.out.println("Número ivalida, selecione novamente");
			}
		}
		this.setQuantidadeRecebida(Teclado.leInt("Qual a quantidade recebida do produto? "));
		this.setFornecedor(Teclado.leString("Digite o nome do fornecedor:  "));
		this.setPrecoFornecedor(Teclado.leDouble("Qual o valor total pago ao fornecedor? "));
		this.setPrecoFornecedor(this.getPrecoFornecedor() / this.getQuantidadeRecebida());
		this.setPreco(this.precoProduto(this.getPrecoFornecedor()));
		System.out.println("O preço de venda do produto vai ficar  " + this.getPreco());
	}


	public double getPrecoFornecedor() {
		return precoFornecedor;
	}

	public void setPrecoFornecedor(double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}

	public int getNumeroCategoria() {
		return numeroCategoria;
	}

	public void setNumeroCategoria(int numeroCategoria) {
		this.numeroCategoria = numeroCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeRecebida() {
		return quantidadeRecebida;
	}

	public void setQuantidadeRecebida(int quantidadeRecebida) {
		this.quantidadeRecebida = quantidadeRecebida;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double precoProduto(double p) {
		this.setPrecoFornecedor(p);
		switch (this.getNumeroCategoria()) {
		case 1:
			this.setPreco((this.getPrecoFornecedor() * 0.70) + this.getPrecoFornecedor());
			break;
		case 2:
			this.setPreco((this.getPrecoFornecedor() * 0.50) + this.getPrecoFornecedor());
			break;
		case 3:
			this.setPreco((this.getPrecoFornecedor() * 0.50) + this.getPrecoFornecedor());
			break;
		case 4:
			this.setPreco((this.getPrecoFornecedor() * 0.65) + this.getPrecoFornecedor());
			break;
		}
		return this.getPreco();

	}

	public void informacoesProduto() {
		System.out.println("-----------Produto Cadastrado------------");
		System.out.println("|Nome : " + this.getNome());
		System.out.println("|Categoria : " + this.getCategoria());
		System.out.println("|Preço venda : " + this.getPreco());
		System.out.println("|Fornecedor : " + this.getFornecedor());
		System.out.println("|Quantidade recebida : " + this.getQuantidadeRecebida());

	}
}
