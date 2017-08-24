package Banco;

public class Cliente {
	
	private String nome;
	private int idade;
	

	public Cliente(String nome, int idade) {
		this.nome = nome;
		
		if(idade < 200 && idade > 0)
			this.idade = idade;
		else
			this.idade = -1;
		
	}

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
		if(idade < 200 && idade > 0)
			this.idade = idade;
		else
			this.idade = -1;
	}

}
