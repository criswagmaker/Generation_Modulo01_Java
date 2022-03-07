package PooIntrodução;

public class ContaBancaria {
	String nomeFuncionario;
	int senhaFuncionario;
	String emailFuncionario;
	int saldoAtual;
	String cpfFuncionario;

	public ContaBancaria(String nome, String email, int senha, int saldo, String cpf) {
		nomeFuncionario = nome;
		senhaFuncionario = senha;
		emailFuncionario = email;
		saldoAtual = saldo;
		cpfFuncionario = cpf;
	}

	public String getDadosFuncionario() {
		String funcionario = "Olá, aqui estão os dados da sua conta bancária: " + "\n" + "Nome: " + nomeFuncionario + 
				"\n" + "CPF: " + cpfFuncionario + "\nEmail: " + emailFuncionario + "\nSenha: " + senhaFuncionario + "\nSaldo: R$" + saldoAtual;
		return funcionario;
	}
}
