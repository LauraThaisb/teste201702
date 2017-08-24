package Banco;

import java.util.ArrayList;

/**
 * Um banco implantou um sistema para controlar o acesso dos clientes aos caixas. 
 * Cada cliente, ao chegar, registra-se no sistemas, informando seu nome e sua idade. 
 * Os caixas, quando liberados, solicitam ao sistema o pr�ximo cliente. 
 * O sistema est� projetado para dar prioridade a clientes idosos, da seguinte forma:

Os caixas de 1 a 5 dever�o dar prioridade aos clientes com 65 anos ou mais. 
Assim, se houver clientes desta faixa et�ria, aquele que tiver chegado h� mais tempo deve ser selecionado. 
Caso n�o haja, seleciona o cliente (de qualquer idade) que est� a espera;
Os caixas de 6 em diante devem selecionar o cliente que est� h� mais tempo a espera, seja ele de que idade for.
Implemente este sistema. A interface com o usu�rio deve oferecer duas op��es: 
uma para o caixa solicitar o pr�ximo cliente (que ser� selecionado de acordo com as regras de prioridade),
 e uma para o cliente se registrar quando chega ao banco. Esta interface pode ser gr�fica ou textual (de prefer�ncia, gr�fica, para praticar).
 * @author 12111746
 *
 */

public class Banco {

	private ArrayList<Cliente> clientes;
	private Caixa caixa;

	public Banco() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente registraCliente(String nome, int idade) {
		Cliente c1 = new Cliente(nome, idade);
		clientes.add(c1);
		return c1;
	}

	public void solicitarProximoCliente() {
		Cliente c1 = null;

		if (caixa.getLiberado() == true) {

			if (caixa.getNumero() <= 5) {

				for(int i=0; i<clientes.size(); i++) {

					if(clientes.get(i).getIdade() >= 65) {
						c1 = clientes.get(i);
						clientes.remove(i);
					}

				}
			} 
			else {
				c1 = clientes.get(0);
			}

			caixa.setLiberado(false);
		}
	}

}
