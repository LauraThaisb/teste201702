package Banco;

public class Caixa {
	
	private boolean liberado;
	private int numero;

	public Caixa(int numero) {
		this.liberado = true;
		if(numero > 0)
			this.numero = numero;
		else
			this.numero = 99;
	}

	public boolean getLiberado() {
		return liberado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero > 0)
			this.numero = numero;
		else
			this.numero = 99;
	}

	public void setLiberado(boolean liberado) {
		this.liberado = liberado;
	}

}
