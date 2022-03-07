package PooIntrodução;

public class ProdutoEletronico {
	/*
	 * Crie uma classe produto eletrônico e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto produto eletrônico, defina
	 * as instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 */
	String tipoProduto;
	String modeloProduto;
	String marcaProduto;

	public ProdutoEletronico(String tipo, String modelo, String marca) {
		tipoProduto = tipo;
		modeloProduto = modelo;
		marcaProduto = marca;
	}

	public String getRegistroProduto() {
		String registro = "Tipo de Eletrônico: " + tipoProduto + "\nModelo: " + modeloProduto + "\nMarca: "
				+ marcaProduto;
		return registro;

	}

}
