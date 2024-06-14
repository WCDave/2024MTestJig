package main;

import java.math.BigDecimal;

public class GetMandelValueImplBuilder {
	public interface IExecution {
		long mandelExecute(int iter);
	}

	IExecution impl;

	public static GetMandelValueImplBuilder createBuilder(IComplexNumber cn) {
		return new GetMandelValueImplBuilder(cn);
	}

	public static GetMandelValueImplBuilder createBuilder(IComplexNumberBigDecimal cbd) {
		return new GetMandelValueImplBuilder(cbd);
	}

	public GetMandelValueImplBuilder(IComplexNumber cn) {
		impl = new GetMandelValueImplBuilder.IExecution() {

			@Override
			public long mandelExecute(int iter) {
				int counter = 0;
				IComplexNumber n2 = cn;
				while ((IComplexNumber.complexMag(n2) < 2) && (counter++ <= iter)) {
					n2 = IComplexNumber.complexAdd(cn, IComplexNumber.complexMult(n2, n2));
				}
				return counter;
			};

		};
	}

	public GetMandelValueImplBuilder(IComplexNumberBigDecimal cn) {
		impl = new GetMandelValueImplBuilder.IExecution() {

			@Override
			public long mandelExecute(int iter) {
				int counter = 0;
				IComplexNumberBigDecimal n2 = cn;
				while ((IComplexNumberBigDecimal.complexMag(n2).compareTo(BigDecimal.TWO) == 1) && (counter++ <= iter)) {
					n2 = IComplexNumberBigDecimal.complexAdd(cn, IComplexNumberBigDecimal.complexMult(n2, n2));
				}
				return counter;
			};

		};
	}

	long execute(int iter) {
		return impl.mandelExecute(iter);
	}
}
