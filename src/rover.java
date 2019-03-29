//rover class
public class rover {

	private int xCoOrd ;
	private int yCoOrd ;
	private char direction;
	private String comands;
	
	
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = Character.toUpperCase(direction);
	}
	public int getyCoOrd() {
		return yCoOrd;
	}
	public void setyCoOrd(int yCoOrd) {
		this.yCoOrd = yCoOrd;
	}
	public int getxCoOrd() {
		return xCoOrd;
	}
	public void setxCoOrd(int xCoOrd) {
		this.xCoOrd = xCoOrd;
	}

	public String getComands() {
		return comands;
	}
	public void setComands(String comands) {
		this.comands = comands.toUpperCase();
	}
	
	public String toString() {
		return ""+xCoOrd+" "+yCoOrd+" "+Character.toUpperCase(direction);
		
	}
	
	
	//rotates the rover right given its current position
	public static char rotateRight(char dir) {
		if (dir=='N') 
			return'E';
		else if (dir=='E') 
			return 'S';
		else if (dir=='S') 
			return 'W';
		else 
			return'N';
	}
	
	
	//rotates the rover left given its current position
	public static char rotateLeft(char dir) {
		if (dir=='N') 
			return'W';
		else if (dir=='W') 
			return 'S';
		else if (dir=='S') 
			return 'E';
		else 
			return'N';
	}
	
	//moves the rover one positions and updates coOrdinates
	public static void move (rover obj) {
		if (obj.getDirection()=='N') {
			obj.setyCoOrd(obj.getyCoOrd()+1);
		}else if (obj.getDirection()=='S') {
			obj.setyCoOrd(obj.getyCoOrd()-1);
		}else if (obj.getDirection()=='E') {
			obj.setxCoOrd(obj.getxCoOrd()+1);
		}else {
			obj.setxCoOrd(obj.getxCoOrd()-1);
		}
	}
	
	
}
