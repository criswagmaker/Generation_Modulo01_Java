package PooIntrodução;

public class Cliente {
	private String nomeCliente;
	private String endereçoCliente;
	private String emailCliente;
	private int idadeCliente;
	private int idCliente;
	private int senhaCliente;

	public Cliente(String nome, int idade, String end, String email, int id, int senha) {
		nomeCliente = nome;
		endereçoCliente = end;
		emailCliente = email;
		idadeCliente = idade;
		idCliente = id;
		senhaCliente = senha;
	}

	public String getDadosCliente() {
		String dados = "Nome: " + nomeCliente + "\nEndereço: " + endereçoCliente + "\nEmail: " + emailCliente
				+ "\nIdade: " + idadeCliente + "\nId de Cadastro: " + idCliente + "\nSenha: " + senhaCliente;
		return dados;
	}

}
