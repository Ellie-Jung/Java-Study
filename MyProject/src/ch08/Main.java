package ch08;

public class Main {

	public static void main(String[] args) {
		CalculatorF calc = new CalculatorF();
		Calculator c = new CalculatorF();
		Calculatorab c2 = new CalculatorF();
		
		
		System.out.println(c.add(2, 9));
		System.out.println(c2.divide(10, 3));
	}

}
