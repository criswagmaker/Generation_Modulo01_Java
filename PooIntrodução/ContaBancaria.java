package PooIntrodu��o;

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
		String funcionario = "Ol�, aqui est�o os dados da sua conta banc�ria: " + "\n" + "Nome: " + nomeFuncionario + 
				"\n" + "CPF: " + cpfFuncionario + "\nEmail: " + emailFuncionario + "\nSenha: " + senhaFuncionario + "\nSaldo: R$" + saldoAtual;
		return funcionario;
	}
}
