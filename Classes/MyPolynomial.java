import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Faison on 07/28/2017.
 */
public class MyPolynomial {
    double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename) {
        Scanner fin = null;
        try {
            fin = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = fin.nextInt();      // read the degree
        coeffs = new double[degree + 1];  // allocate the array
        for (int i = 0; i < coeffs.length; ++i) {
            coeffs[i] = fin.nextDouble();
        }
    }

    public int getDegree() {
        return this.coeffs.length;
    }

    @Override
    public String toString() {
        String str = "" + coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1);
        for (int i = coeffs.length - 2; i > 0; i--) {
            str += ((coeffs[i] < 0) ? " - " : " + ") + Math.abs(coeffs[i]) + "x^" + i;
        }
        str += ((coeffs[0] < 0) ? " - " : " + ") + Math.abs(coeffs[0]);
        return str;
    }

    public double evaluate(double x) {
        double value = 0;
        for (int i = coeffs.length - 1; i > 0; i--) {
            value += Math.pow(x * coeffs[i], i);
        }
        return value;
    }

    public MyPolynomial add(MyPolynomial another) {
        return another;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        return another;
    }
}
