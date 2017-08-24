package marsRover;

public class MarsRover {
	
	private Position position;

	public MarsRover(int x, int y, char c) {
		this.position.setX(x);
		this.position.setY(y);
		this.position.setCardinal(c);
	}
	
	public void move(char c) {
		if (c == 'M'){
			position.setY(position.getY() + 1);
		}
		else if (c == 'L'){
			position.setX(position.getX() - 1);		
		}
		else if (c == 'R'){
			position.setX(position.getX() + 1);
		}
		else {
			
		}
	}

	public Position getPosition() {
		return position;
	}
	
}
