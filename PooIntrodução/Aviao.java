package PooIntrodu��o;

public class Aviao {
	private String modeloAviao;
	private String empresaAviao;
	private int tamanhoAviao;
	private int qtdPassageiros;
	private int combustivelAviao;

	public Aviao(String modelo, String empresa, int tamanho, int passageiros, int combustivel) {
		modeloAviao = modelo;
		empresaAviao = empresa;
		tamanhoAviao = tamanho;
		qtdPassageiros = passageiros;
		combustivelAviao = combustivel;
	}

	public String getRegistroAviao() {
		String registro = "Modelo: " + modeloAviao + "\nEmpresa: " + empresaAviao + "\nTamanho do avi�o: " + tamanhoAviao
				+ "\nQuantidade de Passageiros: " + qtdPassageiros + "\nCombust�vel do avi�o: " + combustivelAviao + "%";
		return registro;
	}
}
