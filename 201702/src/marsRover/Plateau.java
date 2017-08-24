package marsRover;

import java.util.ArrayList;

public class Plateau {
	
	private int largura;
	private int altura;
	private ArrayList<MarsRover> rovers;
	
	public Plateau(int l, int a){
		largura = l;
		altura = a;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void addRover(MarsRover rover) {
		rovers.add(rover);
	}
	
	public ArrayList<MarsRover> getRovers() {
		return rovers;
	}

	public void setRovers(ArrayList<MarsRover> rovers) {
		this.rovers = rovers;
	}

}
