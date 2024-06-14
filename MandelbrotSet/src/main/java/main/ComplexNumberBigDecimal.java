package main;

import java.math.BigDecimal;

public class ComplexNumberBigDecimal implements IComplexNumberBigDecimal {
	
	protected BigDecimal real;
	protected BigDecimal imaginary;
	
	public ComplexNumberBigDecimal() {
		
	}
	
	public ComplexNumberBigDecimal(BigDecimal real, BigDecimal imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}


	@Override
	public void setReal(BigDecimal aReal) {
		this.real = aReal;
	}

	@Override
	public BigDecimal getReal() {
		// TODO Auto-generated method stub
		return real;
	}

	@Override
	public void setImaginary(BigDecimal anImaginary) {
		this.imaginary = anImaginary;
	}

	@Override
	public BigDecimal getImaginary() {
		// TODO Auto-generated method stub
		return imaginary;
	}

}
