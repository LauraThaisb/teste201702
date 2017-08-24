package marsRover;

public class Position {
	
	private int x;
	private int y;
	private char cardinal;

	public Position() {
		this.x=0;
		this.y=0;
		this.cardinal = 'N';
	}
	
	public Position(int x, int y, char c) {
		setCardinal(c);
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getCardinal() {
		return cardinal;
	}

	public void setCardinal(char cardinal) {
		if(cardinal != 'N' || cardinal != 'E'||cardinal != 'S'||cardinal != 'W')
			this.cardinal = 'N';
		else if (cardinal == 'N'){
			this.cardinal = 'N';
			y = y +1;
		}
		else {
			this.cardinal = cardinal;
		}
	}
	

}
