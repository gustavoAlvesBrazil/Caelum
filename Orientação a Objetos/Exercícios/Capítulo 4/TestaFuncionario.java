public class TestaFuncionario {
	public static void main(String[] args) {

		String nome;
		int idade;
		String departamento;
		double salario;
		String dataEntrada;
		String rg;
		boolean contratado;
		String rua;
		String bairro;
		String cidade;
		String cep;
		String estado;


		nome = "Gustavo Alves da Silva";
		idade = 25;
		departamento = "Financeiro";
		salario = 2500.0;
		dataEntrada = "05/12/2016";
		rg = "123.000.000-y";
		contratado = true;
		rua = "Rua das Alcachofras, 00";
		bairro = "Vila das Comidas";
		cidade = "Alimentação";
		cep = "00012-000";
		estado = "Rio das Bananeiras";

		Funcionario f = new Funcionario(nome, idade, departamento, salario,
			dataEntrada, rg, contratado, rua, bairro, cidade, cep, estado);

		String informacoes = f.mostra();

		System.out.println(informacoes);

		System.out.println("Ganho anual do funcionário: " + f.calculaGanhoAnual());

		f.recebeAumento(500.0);

		System.out.println("Novo salário: " + f.getSalario());

		System.out.println("Novo ganho anual: " + f.calculaGanhoAnual());

		f.demite();

		if(f.isContratado()) {
			System.out.println("O funcionário está contratado");
		} else {
			System.out.println("O funcionário foi demitido");
		}
	}
}