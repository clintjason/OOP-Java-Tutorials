public class Circle extends Shape implements GeometricObject{           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   protected double radius;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      super.setColor("red");
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      super.setColor("red");
   }
   
   //3rd constructor with given radius and color
   public Circle(double radius, String color, boolean filled){
      super(color, filled);
      this.radius = radius;
   }
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for retrieving the color
   public String getColor(){
      return super.getColor();
   }

   // Setter for instance variable radius
   public void setRadius(double radius){
      this.radius = radius;
   }
   //Setter for instance variable color
   public void setColor(String color){
      super.setColor(color);
   }
   @Override
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   //A public method to give instance description
   public String toString() {
   	  return "Circle: radius = " + radius + " color = " + getColor();
	}
	@Override
	public double getPerimeter(){
		return 0;
	}
}
