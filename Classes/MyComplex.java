public class MyComplex{
	
	private double real;
	private double imag;
	
	//A constructor
	public MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
		}
		
	//A public method to get the real value
	public double getReal(){
		return real;
		}
		
	//A Public method to set the real value
	public void setReal(double real){
		this.real = real;
		}
		
	//A public method to get the image value
	public double getImag(){
		return imag;
		}
		
	//A Public method to set the image value
	public void setImag(double imag){
		this.imag = imag;
		}
		
	// A public method to set the value of the complex number
	public void setValue(double real, double imag){
		this.real = real;
		this.imag = imag;
		}
		
	//A public method to desc the #
	public String toString(){
		if(imag>0){
			return "(" + real + " + " + imag + "i)";
			}
		else if(imag < 0){
			return "(" + real + " " + imag + "i)";
			}
		else{
			return "(" + real + " + " + imag + "i)";
			}		
		}
		
	//A public method to test if the complex # is real
	public boolean isReal(){
		if(imag==0){
			return true;
			}
		else{ return false; }
		
		}
		
	//A public method to test if the complex # is imaginary
	public boolean isImaginary(){
		if(real==0){
			return true;
			}
		return false;
		}
		
	//An overloaded public method to check equality of complex #
	public boolean equals(double real, double imag){
		if(this.real == real && this.imag==imag){
			return true;
			}
		return false;
		}
		
	//An overloaded public method to check equality of complex #
	public boolean equals(MyComplex another){
		if(this.real == another.real && this.imag == another.imag){
			return true;
			}
		return false;
		}
		
	//A public method to calculate magnitude of the complex #
	public double magnitude(){
		return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
		}
	
	//A public method to return arguments of complex # in radians
	public double argumentInRadians(){
		return Math.atan2(imag, real);
		}
		
	//A public method to return arguments in degrees
	public double argumentInDegrees(){
		return argumentInRadians() * (180/Math.PI);
		}
		
	//A public method that returns the complex conjugate
	public MyComplex conjugate(){
		double newImag = -1 * imag;
		return new MyComplex(real, newImag);
		}
		
	//A public method to add complex numbers
	public MyComplex add(MyComplex another){
		double aReal = this.real + another.real;
		double aImag = this.imag + another.imag;
		return new MyComplex(aReal, aImag);
		}
		
	//A public method to substract complex numbers
	public MyComplex subtract(MyComplex another){
		double sReal = this.real - another.real;
		double sImag = this.imag - another.imag;
		return new MyComplex(sReal, sImag);
		}
		
	//A public method to multiply complex numbers
	public MyComplex multiplyWith(MyComplex another){
		double mReal = this.real * another.real;		
		double mImag = this.imag * another.imag;
		double rDiff = mReal - mImag;
		
		double mR = this.real * another.imag;
		double mI = this.imag * another.real;
		double iSum = mR + mI;
		return new MyComplex(rDiff, iSum);
		}
		
	//A public method to divide complex numbers
	public MyComplex divideBy(MyComplex another){
		double denom = Math.pow(another.real, 2) + Math.pow(another.conjugate().imag, 2);
		MyComplex conjugate = another.conjugate();
		this.real = real / denom;
		this.imag = imag / denom;
		double arg4 = conjugate.real / denom;
		double arg5 = conjugate.imag / denom;

		return multiplyWith(new MyComplex(arg4, arg5));
		}

	}
