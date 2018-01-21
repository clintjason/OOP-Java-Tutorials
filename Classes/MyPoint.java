public class MyPoint{
	private int x = 0;
	private int y = 0;

	//overloaded constructor with no arguments
	public MyPoint(){
	}

	//overloaded constructor with two arguments
	public MyPoint(int x, int y){
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

	//A public method that returns the distance between input point and current point
	public double distance(int x, int y){
		int xDiff =  x - this.x;
	    int yDiff = y - this.y;
	    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	//A public method that returns the distance between this point the inputed
	public double distance(MyPoint anotherPoint){
		int xDiff = anotherPoint.x - this.x;
		int yDiff = anotherPoint.y - this.y;
	    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);		
	}

}
