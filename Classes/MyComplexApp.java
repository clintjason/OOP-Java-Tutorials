import java.util.Scanner;
public class MyComplexApp{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] param = new double[2];		
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		for(int i=0;i<param.length;i++){
			param[i] = scan.nextDouble();
			}
		double[] arg = new double[2];
		System.out.print("Enter complex number 2 (real and imaginary part): ");
		for(int i=0;i<arg.length;i++){
			arg[i] = scan.nextDouble();
			}
		MyComplex complexNum1 = new MyComplex(param[0],param[1]);
		MyComplex complexNum2 = new MyComplex(arg[0],arg[1]);
		System.out.println("\nNumber 1 is: " + complexNum1.toString() );
		if(complexNum1.isReal()){
			System.out.println(complexNum1 + " is a pure real number");
			}
		else{
			System.out.println(complexNum1 + " is NOT a pure real number");
			}
		
		if(complexNum1.isImaginary()){
			System.out.println(complexNum1 + " is a pure imaginary number");
			}
		else{
			System.out.println(complexNum1 + " is NOT a pure imaginary number");
			}
		
		System.out.println("\nNumber 2 is: " + complexNum2 );
		if(complexNum2.isReal()){
			System.out.println(complexNum2 + " is a pure real number");
			}
		else{
			System.out.println(complexNum2 + " is NOT a pure real number");
			}
		
		if(complexNum1.isImaginary()){
			System.out.println(complexNum2 + " is a pure imaginary number");
			}
		else{
			System.out.println(complexNum2 + " is NOT a pure imaginary number");
			}
		System.out.println();
		if(complexNum1.equals(complexNum2)){
			System.out.println(complexNum1 + " is equal to " + complexNum2);
			}
		else{
			System.out.println(complexNum1 + " is NOT equal to " + complexNum2);
			}
		
		System.out.println();
		System.out.println(complexNum1 + " + " + complexNum2 + " = " + complexNum1.add(complexNum2));
		System.out.println();
		System.out.println(complexNum1 + " - " + complexNum2 + " = " + complexNum1.subtract(complexNum2));
		System.out.println();
		System.out.println(complexNum1 + " * " + complexNum2 + " = " + complexNum1.multiplyWith(complexNum2));
		System.out.println();
		System.out.println(complexNum1 + " / " + complexNum2 + " = " + complexNum1.divideBy(complexNum2));
	}
}
