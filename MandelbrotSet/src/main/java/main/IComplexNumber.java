package main;

public interface IComplexNumber {

	void setReal(double aReal);

	double getReal();

	void setImaginary(double anImaginary);

	double getImaginary();
	
	public static ComplexNumberSimple complexMult(IComplexNumber c1, IComplexNumber c2) {
		// (ai+b)*(ui+w) = -au+(aw+bu)i+bw
		double r = -c1.getImaginary() * c2.getImaginary() + c1.getReal() * c2.getReal();
		double i = c1.getImaginary() * c2.getReal() + c1.getReal() * c2.getImaginary();
		ComplexNumberSimple result = new ComplexNumberSimple(r, i);
		return result;
	}
	
	public static ComplexNumberSimple complexDiv(ComplexNumberSimple c1, ComplexNumberSimple c2) {
		double r = 0;
		double i = 0;
		double divisor = (c2.real * c2.real + c2.imaginary * c2.imaginary);
		if (divisor != 0) {
			r = (c1.real * c2.real + c1.imaginary * c2.imaginary) / divisor;
			i = (c1.imaginary * c2.real - c1.real * c2.imaginary) / divisor;
		}
		return new ComplexNumberSimple(r, i);
	}

	public static ComplexNumberSimple complexAdd(IComplexNumber c1, IComplexNumber c2) {
		ComplexNumberSimple result = new ComplexNumberSimple();
		result.imaginary = c1.getImaginary() + c2.getImaginary();
		result.real = c1.getReal() + c2.getReal();
		return result;
	}

	public static double complexMag(IComplexNumber c) {
		return (double) Math.sqrt(c.getImaginary() * c.getImaginary() + c.getReal() * c.getReal());
	}


}