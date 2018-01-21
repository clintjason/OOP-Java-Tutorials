public class TestMyTriangle{
	public static void main(String[] args){
		
		MyTriangle t1 = new MyTriangle(1,1,10,10,30,30);
		System.out.println(t1);
		
		MyPoint p1 = new MyPoint(12,16);
		MyPoint p2 = new MyPoint(22,26);
		MyPoint p3 = new MyPoint(32,36);
		MyTriangle t2 = new MyTriangle(p1,p2,p3);
		System.out.println(t2);		
		
		//getPerimeter test
		System.out.println("The perimeter of triangle 1 is " + t1.getPerimeter());
		System.out.println("The perimeter of triangle 2 is " + t2.getPerimeter());
		
		System.out.print("Triangle 1 is ");
		t1.printType();
		
		System.out.print("Triangle 2 is ");
		t2.printType();
		
		MyTriangle t3 = new MyTriangle(10,10,20,20,20,20);
		System.out.print("Triangle 3 is ");
		t3.printType();
		
		
		
		}			
	}
