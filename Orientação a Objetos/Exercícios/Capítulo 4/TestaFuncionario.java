public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();

		f.nome = "Gustavo";
		f.departamento = "Financeiro";
		f.salario = 2500.0;
		f.dataEntrada = "25/09/2010";
		f.rg = "12.345.678-x";

		String informacoes = f.exibeInformacoes();

		System.out.println(informacoes);

		System.out.println("Ganho anual do funcionário: " + f.calculaGanhoAnual());

		f.recebeAumento(500.0);

		System.out.println("Novo salário: " + f.salario);

		System.out.println("Novo ganho anual: " + f.calculaGanhoAnual());

		f.demite();

		if(f.isContratado) {
			System.out.println("O funcionário está contratado");
		} else {
			System.out.println("O funcionário foi demitido");
		}

		f.rua = "Exemplo, 123";
		f.bairro = "Exemplos";
		f.cidade = "Java City";
		f.cep = "11122-123";
		f.estado = "Orientação a Objetos";

		String endereco = "Endereço do funcionário: " + f.mostraEnderecoCompleto();

		System.out.println(endereco);
	}
}