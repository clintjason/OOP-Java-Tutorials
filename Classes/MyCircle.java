public class MyCircle{
	
	private MyPoint center;
	private int radius = 1;
	
	//overloaded constructor with 3 int arguments
	public MyCircle(int x, int y, int radius){
		center = new MyPoint();
		center.setXY(x,y);
		this.radius = radius;
		}
	//overloaded constructor with 2 arguments
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
		}
		
	// Public method to get the instance radius
	public int getRadius(){
		return radius;
		}
	
	//Public method to set the radius to the the circle instance
	public void setRadius(int radius){
		this.radius = radius;
		}
	
	//Public method to get the center of the circle instance
	public MyPoint getCenter(){
		return center;
		}
	
	//Public method to set a circle instance center
	public void setCenter(MyPoint center){
		this.center = center;
		}
	
	//Public method to get the X axis coordinates of the circle center
	public int getCenterX(){
		return center.getX();
		}
	
	//Public method to get the Y axis coordinates of the circle center
	public int getCenterY(){
		return center.getY();
		}
		
	//Public method to set the coordinates of the circle center
	public void setCenterXY(int x, int y){
		center.setXY(x,y);
		}
	
	//A public method to describe the circle
	public String toString(){
		return "Circle @ " + this.getCenter()  + " radius=" + radius;
		//return "Circle @ (" + this.getCenterX() + "," + this.getCenterY() + ") radius=" + radius;
		}
	
	//A public mehtod to return the area of the circle
	public double getArea(){
		return radius * radius * Math.PI;
		}
	
	
	}
