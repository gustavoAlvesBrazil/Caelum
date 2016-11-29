public class Funcionario {
	public String nome;
	public int idade;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;

	public void recebeAumento(double aumento) {
		salario += aumento;
	}

	public double calculaGanhoAnual() {
		return salario * 12;
	}

	public String exibeInformacoes() {
		return "Informações do Funcionário" +
				"\nNome: " + nome + 
				"\nIdade: " + idade +
				"\nDepartamento: " + departamento +
				"\nSalário: " + salario +
				"\nData de Entrada: " + dataEntrada +
				"\nRG: " + rg;

	}
}