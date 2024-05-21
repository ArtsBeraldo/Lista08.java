package PooAtividade;

public class Empregado {
	private String nome;
	private int idade;
	private double salario;
	
	// NOME
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// IDADE
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		if (this.idade < 0) {
			System.out.println("Idade inválida");
		}
		else {
			this.idade = idade;
		}
	}
	
	// SALARIO
		public double getSalario() {
			return this.salario;
		}
		public void setSalario(double salario) {
			if (this.salario < 0) {
				System.out.println("Valor inválido");
			}
			else {
				this.salario = salario;
			}
		}
		
	public void promover() {
		if (idade < 18) {
			System.out.println("Não é possivel ter uma promoção");
		}
		else {
			aumentarSalario(25);
		}
	}
	public void aumentarSalario(double aumento) {
		if (aumento > 0) {
			salario += salario * (aumento / 100);
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	public void demitir(int motivo) {
		if (motivo == 1) {
			System.out.println("Justa causa! O funcionário deverá cumprir aviso prévio.");
		}
		else if (motivo == 2) {
			System.out.println("Decisão do empregador! Você receberá uma multa de R$ " + (salario * 0.4));
		}
		else if (motivo == 3) {
			if (salario < 2000) {
				System.out.println("Aposentadoria! Salário será de R$ 1500");
				this.salario = 1500;
			}
			else if (salario < 3000) {
				System.out.println("Aposentadoria! Salário será de R$ 2500");
				this.salario = 2500;
			}
			else if (salario < 4000) {
				System.out.println("Aposentadoria! Salário será de R$ 3500");
				this.salario = 3500;
			}
			else if (salario > 4000) {
				System.out.println("Aposentadoria! Salário será de R$ 4000");
				this.salario = 4000;
			}
			else {
				System.out.println("Algo deu errado! :( ");
			}
		}
		else {
			System.out.println("Número inválido para motivo");
		}
	}
	public void fazerAniversario() {
		this.idade += 1;
	}
	
	public void status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: R$" + this.salario);
	}
}