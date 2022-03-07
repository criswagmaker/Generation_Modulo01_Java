package PooIntrodução;

public class ex06 {
	public static void main(String[] args) {
		ContaBancaria contaBanco = new ContaBancaria("Cristian Wagmaker", "criswag28@email.com", 12345, 7000,
				"123.456.789-10");
		System.out.println(contaBanco.getDadosFuncionario());
	}
}
