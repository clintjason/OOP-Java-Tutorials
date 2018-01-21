public class TestPoint{
	public static void main(String[] args) {
		Point p1 = new Point(3, 0);
		Point p2 = new Point(0, 4);

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
