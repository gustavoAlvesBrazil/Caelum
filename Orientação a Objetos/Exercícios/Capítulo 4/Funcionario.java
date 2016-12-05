public class Funcionario {
	private String nome;
	private int idade;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean contratado;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;

	public Funcionario() {
		this("",0,"",0.0,"","",true,"","","","","");
	}

	public Funcionario(String nome, int idade, String departamento, 
					   double salario, String dataEntrada, String rg, boolean contratado,
					   String rua, String bairro, String cidade, String cep, String estado) {

		setNome(nome);
		setIdade(idade);
		setDepartamento(departamento);
		setSalario(salario);
		setDataEntrada(dataEntrada);
		setRg(rg);
		setContratado(contratado);
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setCep(cep);
		setEstado(estado);

	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Métodos específicos

	public void recebeAumento(double aumento) {
		salario += aumento;
	}

	public double calculaGanhoAnual() {
		double calculo = salario * 12; 
		return calculo;
	}

	public String mostra() {
		String informacoes =  "Informações do Funcionário" +
				"\nNome: " + getNome() + 
				"\nIdade: " + getIdade() +
				"\nDepartamento: " + getDepartamento() +
				"\nSalário: " + getSalario() +
				"\nData de Entrada: " + getDataEntrada() +
				"\nRG: " + getRg() +
				"\nEstá contratado: " + isContratado() +
				"\nRua: " + getRua() +
				"\nBairro: " + getBairro() +
				"\nCidade: " + getCidade() +
				"\nCEP: " + getCep() + 
				"\nEstado: " + getEstado();

				return informacoes;
	}

	public void demite() {
		setContratado(false);
	}
}