package PooIntrodução;

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
		String registro = "Modelo: " + modeloAviao + "\nEmpresa: " + empresaAviao + "\nTamanho do avião: " + tamanhoAviao
				+ "\nQuantidade de Passageiros: " + qtdPassageiros + "\nCombustível do avião: " + combustivelAviao + "%";
		return registro;
	}
}
