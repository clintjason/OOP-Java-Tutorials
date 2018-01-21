public class TestMyCircle{
	
	public static void main (String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyCircle c1 = new MyCircle(p1,5);
		System.out.println(c1);
		
		MyCircle c2 = new MyCircle(1,1,15);
		System.out.println(c2);
		
		System.out.println("The circle c1 has radius = " + c1.getRadius() 
		 + " and center (" + c1.getCenterX() + "," + c1.getCenterY() + ")" );
		 
		c1.setRadius(20);
		c1.setCenter(new MyPoint(25,25));
		System.out.println("The circle c1 has radius = " + c1.getRadius() + " and center " + c1.getCenter()) ;
		
		c2.setCenterXY(12,16);
		System.out.println("The circle c2 has center " + c2.getCenter());
		c2.setCenterXY(48,16);
		System.out.println("The circle c2 has center " + c2.getCenter() + "\n \t radius " + c2.getRadius() 
		+ " \n \t area " + c2.getArea());
		
		}
	
	}
