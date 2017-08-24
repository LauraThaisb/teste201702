package contaMagica;

public class ContaMagica {
	
	 private double saldo;
	 private String nomeCliente;
	 private Categoria categoria;

	 public ContaMagica(String nome){
		 this.saldo = 0.00;
		 this.nomeCliente = nome;
		 this.categoria = Categoria.SILVER;
	 }
	 
	 public String getNomeCliente(){
		return nomeCliente;
		 
	 }
	 
	 public double getSaldo(){
		return saldo;
		 
	 }
	 
	 public Categoria getCategoria(){
		return categoria;
		 
	 }
	 
	 public Categoria getStatus(){
		return this.categoria;
		 
	 }
	 
	 public void deposito(Double deposito) {
		if(deposito > 0) {
			if (categoria == Categoria.GOLD) {
				this.saldo = saldo + (deposito * 0.01);
			}
			else if (categoria == Categoria.PLATINUM) {
				this.saldo = saldo + (deposito * 0.025);
			}
			else {
				this.saldo = saldo + deposito;
			}
		}

		 elevarCategoria();
	 }
 
	 public void retirada(Double valor) {
		 saldo = saldo - valor;
		 
		 rebaixarCategoria();
	 }
	 
	 private void elevarCategoria() {
		 if (saldo >= 200000) {
			 this.categoria = Categoria.PLATINUM;
		 }
		 else if (saldo >= 50000) {
			 this.categoria = Categoria.GOLD;
		 }
		 else {
			 this.categoria = Categoria.SILVER;
		 }
	 }
	 
	 private void rebaixarCategoria() {
		 if (saldo < 200000 && categoria == Categoria.PLATINUM) {
			 this.categoria = Categoria.GOLD;
		 }
		 else if (saldo < 50000) {
			 this.categoria = Categoria.SILVER;
		 }
	 }

}
