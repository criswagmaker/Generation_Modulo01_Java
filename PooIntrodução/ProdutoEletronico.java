package PooIntrodu��o;

public class ProdutoEletronico {
	/*
	 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	 * referentes esta classe, em seguida crie um objeto produto eletr�nico, defina
	 * as instancias deste objeto e apresente as informa��es deste objeto no
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
		String registro = "Tipo de Eletr�nico: " + tipoProduto + "\nModelo: " + modeloProduto + "\nMarca: "
				+ marcaProduto;
		return registro;

	}

}
