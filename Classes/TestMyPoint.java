public class TestMyPoint{
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

		// Testing the overloaded method distance()
		System.out.println(p1.distance(p2));    // distance between p1 and p2
		System.out.println(p1.distance(5, 6));  // distance between p1 coordinates

		//testing the get methods
		System.out.println(" The x and y coordinates of the point is " + p1.getX() + " and " + p1.getY());
		//testing the set methods
		p2.setX(10);
		p2.setY(4);
		p1.setXY(2,5);

		//testing the toString method
		System.out.println(p1);
		System.out.println(p2.toString());

	}
}
