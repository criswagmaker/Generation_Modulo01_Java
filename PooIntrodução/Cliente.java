package PooIntrodu��o;

public class Cliente {
	private String nomeCliente;
	private String endere�oCliente;
	private String emailCliente;
	private int idadeCliente;
	private int idCliente;
	private int senhaCliente;

	public Cliente(String nome, int idade, String end, String email, int id, int senha) {
		nomeCliente = nome;
		endere�oCliente = end;
		emailCliente = email;
		idadeCliente = idade;
		idCliente = id;
		senhaCliente = senha;
	}

	public String getDadosCliente() {
		String dados = "Nome: " + nomeCliente + "\nEndere�o: " + endere�oCliente + "\nEmail: " + emailCliente
				+ "\nIdade: " + idadeCliente + "\nId de Cadastro: " + idCliente + "\nSenha: " + senhaCliente;
		return dados;
	}

}
