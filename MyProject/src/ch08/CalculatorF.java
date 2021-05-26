package ch08;

public class CalculatorF extends Calculatorab {

	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}
	@Override
	public long substract(long n1, long n2) {
		return n1-n2;
	}
	@Override
	public long multuply(long n1, long n2) {
		return n1*n2;
	}
	@Override
	public double divide(double n1, double n2) {
		return (double)n1/n2;
	}
	
}
