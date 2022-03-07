package PooIntrodução;

public class Funcionario {
	String nomeFunc;
	String cargoFunc;
	int idadeFunc;
	String enderecoFunc;
	String emailFunc;
	int salarioFunc;
	int senhaFunc;

	public Funcionario(String nome, String cargo, int idade, String end, String email, int salario, int senha) {
		nomeFunc = nome;
		cargoFunc = cargo;
		idadeFunc = idade;
		enderecoFunc = end;
		emailFunc = email;
		salarioFunc = salario;
		senhaFunc = senha;
	}

	public String getDadosFuncionario() {
		String dados = "Nome: " + nomeFunc + "\nIdade: " + idadeFunc + " anos" + "\nCargo: " + cargoFunc + "\nEndereço: " + enderecoFunc +
				"\nSalario: " + salarioFunc + "\nEmail: " + emailFunc +"\nSenha: " + senhaFunc;
		return dados;
	}
}
