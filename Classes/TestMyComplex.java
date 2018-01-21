public class TestMyComplex{
	public static void main(String[] args){
		MyComplex complexNum1 = new MyComplex(5, 8);
		System.out.println(complexNum1);
		complexNum1.setReal(2);
		complexNum1.setImag(12);
		System.out.println("Real " + complexNum1.getReal() + "\nImaginary " + complexNum1.getImag());
		complexNum1.setValue(2, 0);
		System.out.println(complexNum1.isReal());
		complexNum1.setValue(0, 15);		
		System.out.println(complexNum1.isImaginary());
		System.out.println(complexNum1.equals(0,15));
		System.out.println("The equals method returns " + complexNum1.equals(new MyComplex(0,15)));
		System.out.println("The magnitude is " + complexNum1.magnitude());
		System.out.println("The arguments in radian is " + complexNum1.argumentInRadians());
		System.out.println("The arguments in degrees is " + complexNum1.argumentInDegrees());
		complexNum1.setValue(4,6);
		System.out.println("The conjugate is " + complexNum1.conjugate());
		System.out.println("The complex addition equals " + complexNum1.add(new MyComplex(9,14)));
		System.out.println("The complex subtraction equals " + complexNum1.subtract(new MyComplex(9,14)));
		System.out.println("The complex multiplication equals " + complexNum1.multiplyWith(new MyComplex(9,14)));
		System.out.println("The complex division equals " + complexNum1.divideBy(new MyComplex(9,14)));

		}	
	}
