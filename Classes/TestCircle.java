public class TestCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle of radius " 
         + c1.getRadius() + " and color "+ c1.getColor() + "  has an area of " + c1.getArea());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle of radius " 
         + c2.getRadius() + " and color "+ c2.getColor() + "  has an area of " + c2.getArea());

      // Declare and allocate an instance of class Circle called c3
      //  with the given radius and color

      Circle c3 = new Circle(3.0,"orange");
      System.out.println("The circle of radius " 
         + c3.getRadius() + " and color "+ c3.getColor() + "  has an area of " + c3.getArea());
      //change radius
      c3.setRadius(5.0);
      c3.setColor("Brown");

      System.out.println(c3.toString()); //explicit toString declaration
      System.out.println(c3); //implicit toString Declaration
      System.out.println("Even with the + operator it works" + c2);



   }
}