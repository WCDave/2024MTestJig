package main;

public class ComplexNumberSimple implements IComplexNumber {
	protected double real;
	protected double imaginary;

	public ComplexNumberSimple() {

	}

	public ComplexNumberSimple(double r, double i) {
		real = r;
		imaginary = i;
	}

	@Override
	public void setReal(double aReal) {
		real = aReal;
		return;
	}

	@Override
	public double getReal() {
		return real;
	}

	@Override
	public void setImaginary(double anImaginary) {
		imaginary = anImaginary;
		return;
	}

	@Override
	public double getImaginary() {
		return imaginary;
	}

	
}
