public class Funcionario {
	public String nome;
	public int idade;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;
	public boolean isContratado;
	public String rua;
	public String bairro;
	public String cidade;
	public String cep;
	public String estado;

	public Funcionario() {
		isContratado = true;
	}

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

	public void demite() {
		isContratado =  false;
	}

	public String mostraEnderecoCompleto() {
		String endereco = rua + " - " + bairro + " - " + cidade +
						  " - " + estado + " - CEP: " + cep;
		return endereco;
	}
}