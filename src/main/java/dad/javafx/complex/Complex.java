package dad.javafx.complex;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Complex {

	private DoubleProperty real = new SimpleDoubleProperty(0);
	private DoubleProperty imaginary = new SimpleDoubleProperty(0);
	
	public Complex() {
	}
	
	public Complex(double real, double imaginary) {
		super();
		setReal(real);
		setImaginary(imaginary);
	}
	
	public final DoubleProperty realProperty() {
		return this.real;
	}

	public final double getReal() {
		return this.realProperty().get();
	}

	public final void setReal(final double real) {
		this.realProperty().set(real);
	}

	public final DoubleProperty imaginaryProperty() {
		return this.imaginary;
	}

	public final double getImaginary() {
		return this.imaginaryProperty().get();
	}

	public final void setImaginary(final double imaginario) {
		this.imaginaryProperty().set(imaginario);
	}
	
	@Override
	public String toString() {
		return getReal() + "+" + getImaginary() + "i";
	}
	
	public Complex add(Complex c) {
		Complex complex = new Complex();
		complex.realProperty().bind(real.add(c.realProperty()));
		complex.imaginaryProperty().bind(imaginary.add(c.imaginaryProperty()));
		return complex;
	}
	
	public Complex subtract(Complex c) {
		Complex complex = new Complex();
		complex.realProperty().bind(real.subtract(c.realProperty()));
		complex.imaginaryProperty().bind(imaginary.subtract(c.imaginaryProperty()));
		return complex;
	}
	
	public static void main(String[] args) {
		Complex a = new Complex(1, 2);
		Complex b = new Complex(3, 4);
		Complex c = a.add(b);
		Complex d = a.subtract(b);
		System.out.println(c);		
		System.out.println(d);
	}

}