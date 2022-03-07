package PooIntrodução;

public class Paciente {
	String nomePaciente;
	String estadoPaciente;
	String quartoPaciente;
	double alturaPaciente;
	double pesoPaciente;
	int idadePaciente;
	String horaEntrada;
	String horaSaida;

	public Paciente(String nome, String estado, String quarto, double altura, double peso, int idade, String entrada,
			String saida) {
		nomePaciente = nome;
		estadoPaciente = estado;
		quartoPaciente = quarto;
		alturaPaciente = altura;
		pesoPaciente = peso;
		idadePaciente = idade;
		horaEntrada = entrada;
		horaSaida = saida;
	}

	public String getFichaPaciente() {
		String ficha = "------FICHA DO PACIENTE------" + "\n" + "Nome: " + nomePaciente
				+ "\nIdade: " + idadePaciente + " anos" + "\nAltura: " + alturaPaciente + "\nPeso: " + pesoPaciente
				+ " kgs" + "\nEstado do Paciente: " + estadoPaciente + "\nHora de Entrada: " + horaEntrada + "\nHora de Saída: "
				+ horaSaida + "\n-----------------------------";
		return ficha;
	}

}
