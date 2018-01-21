public class Point{

	private int x = 0;
	private int y = 0;

	//overloaded constructor with no arguments
	public Point(){
	}

	//overloaded constructor with two arguments
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//A public method to get the private variable x
	public int getX(){
		return x;
	}
	//A public method to set the private variable x
	public void setX(int x){
		this.x = x;
	}
	//A public method to get the private variable y
	public int getY(){
		return y;
	}
	//A public method to set the private variable x
	public void setY(int y){
		this.y = y;
	}
	//A public method to set both private coordinates
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	//A public method to give a desc of the point
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
}
