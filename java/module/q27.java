// Print the sum, difference and product of two complex numbers by creating a class
//named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user. 
package module;

import java.util.Scanner;

class Complex{
	double real;
	double img;
	
	Complex(double real,double img){
		this.img=img;
		this.real=real;
	}
	Complex add(Complex seond) {
		double sumReal = this.real + real;
        double sumImag = this.img + img;
        return new Complex(sumReal, sumImag);
		
	}
	 Complex subtract(Complex seond) {
        double diffReal = this.real - real;
        double diffImag = this.img - img;
        return new Complex(diffReal,diffImag);
    }
	  Complex multiply(Complex seond) {
	        double prodReal = (this.real * real) ;
	        double prodImag = (this.img * img) ;
	        return new Complex(prodReal, prodImag);
	    }
	 void display() {
	        System.out.println(real + " + " + img + "i");
	    }
}
public class q27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imag1);

       
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = sc.nextDouble();
        Complex complex2 = new Complex(real2, imag2);
        
        Complex sum = complex1.add(complex2);
        System.out.println("Sum:" );
        sum.display();
        
        Complex difference = complex1.subtract(complex2);
        System.out.println("Difference:");
        difference.display();

        Complex product = complex1.multiply(complex2);
        System.out.println("Product:");
        product.display();
	}

}
