package PooIntrodu��o;

public class Patinete {
	/*
	 * Crie uma classe patinete e apresente os atributos e m�todos referentes esta
	 * classe, em seguida crie um objeto patinete, defina as instancias deste objeto
	 * e apresente as informa��es deste objeto no console.
	 */
	String corPatinete;
	double precoPatinete;
	
	public Patinete(String cor, double preco) {
		corPatinete = cor;
		precoPatinete = preco;
	}
	
	String getDadosPatinete() {
		String patineteDados = "Ol�, aqui est�o os detalhes do produto" + "\nCor do produto: " + corPatinete + "\nPre�o do produto: R$" + precoPatinete;
		return patineteDados;
	}
	
	

}
