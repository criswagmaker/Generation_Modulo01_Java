package PooIntrodução;

public class Patinete {
	/*
	 * Crie uma classe patinete e apresente os atributos e métodos referentes esta
	 * classe, em seguida crie um objeto patinete, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */
	String corPatinete;
	double precoPatinete;
	
	public Patinete(String cor, double preco) {
		corPatinete = cor;
		precoPatinete = preco;
	}
	
	String getDadosPatinete() {
		String patineteDados = "Olá, aqui estão os detalhes do produto" + "\nCor do produto: " + corPatinete + "\nPreço do produto: R$" + precoPatinete;
		return patineteDados;
	}
	
	

}
