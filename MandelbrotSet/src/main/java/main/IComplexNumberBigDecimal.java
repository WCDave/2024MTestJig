package main;

import java.math.BigDecimal;
import java.math.MathContext;

public interface IComplexNumberBigDecimal {
	void setReal(BigDecimal aReal);
	
	static final BigDecimal SQRT_DIG = new BigDecimal(150);
	static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());


	BigDecimal getReal();

	void setImaginary(BigDecimal anImaginary);

	BigDecimal getImaginary();
	
	public static IComplexNumberBigDecimal complexMult(IComplexNumberBigDecimal c1, IComplexNumberBigDecimal c2) {
		// (ai+b)*(ui+w) = -au+(aw+bu)i+bw
		BigDecimal r = c1.getImaginary().multiply(c2.getImaginary()).add(c1.getReal().multiply(c2.getReal())).negate();		
		BigDecimal i = c1.getImaginary().multiply(c2.getReal()).add(c1.getReal().multiply(c2.getImaginary()));
		IComplexNumberBigDecimal result = new ComplexNumberBigDecimal(r, i);
		return result;
	}
//	
//	public static ComplexNumberSimple complexDiv(ComplexNumberSimple c1, ComplexNumberSimple c2) {
//		double r = 0;
//		double i = 0;
//		double divisor = (c2.real * c2.real + c2.imaginary * c2.imaginary);
//		if (divisor != 0) {
//			r = (c1.real * c2.real + c1.imaginary * c2.imaginary) / divisor;
//			i = (c1.imaginary * c2.real - c1.real * c2.imaginary) / divisor;
//		}
//		return new ComplexNumberSimple(r, i);
//	}
//
	public static IComplexNumberBigDecimal complexAdd(IComplexNumberBigDecimal c1, IComplexNumberBigDecimal c2) {
	    IComplexNumberBigDecimal result = new ComplexNumberBigDecimal();
	    result.setImaginary(c1.getImaginary().add(c2.getImaginary()));
	    result.setReal(c1.getReal().add(c2.getReal()));
		return result;
	}
//
	public static BigDecimal complexMag(IComplexNumberBigDecimal c) {

		BigDecimal result = c.getImaginary().multiply(c.getImaginary()).add(c.getReal().multiply(c.getReal())).sqrt(MathContext.DECIMAL32);
		return result;
//		return (double) Math.sqrt(c.getImaginary() * c.getImaginary() + c.getReal() * c.getReal());
	}
	
//	public static BigDecimal complexMag(IComplexNumberBigDecimal c) {
//		BigDecimal result = BigDecimal.ZERO.doubleValue();
//		result = Math.sqrt(c.getImaginary().multiply(c.getImaginary()).add(c.getReal().multiply(c.getReal())).round(MathContext.DECIMAL32).doubleValue());
//		return result;
////		return (double) Math.sqrt(c.getImaginary() * c.getImaginary() + c.getReal() * c.getReal());
//	}
//	public static BigDecimal sqrtNewtonRaphson(BigDecimal c, BigDecimal xn, BigDecimal precision){
//	    BigDecimal fx = xn.pow(2).add(c.negate());
//	    BigDecimal fpx = xn.multiply(new BigDecimal(2));
//	    BigDecimal xn1 = fx.divide(fpx,2*SQRT_DIG.intValue(),BigDecimal.ROUND_HALF_DOWN);
//	    xn1 = xn.add(xn1.negate());
//	    BigDecimal currentSquare = xn1.pow(2);
//	    BigDecimal currentPrecision = currentSquare.subtract(c);
//	    currentPrecision = currentPrecision.abs();
//	    if (currentPrecision.compareTo(precision) <= -1){
//	        return xn1;
//	    }
//	    return sqrtNewtonRaphson(c, xn1, precision);
//	}

}
