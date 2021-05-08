
public class AccountingApp {

	public static void main(String[] args) {

	
		double ValueOfSupply = 20000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = extracted(ValueOfSupply, vatRate);
		double total = ValueOfSupply+vat;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply-expense;
		double dividend1 = (income)*0.5;
		double dividend2 = (income)*0.3;
		double dividend3 = (income)*0.2;
		
		
		System.out.println("Value of supply : " +ValueOfSupply);
		System.out.println("VAT :"+ vat);
		System.out.println("Total :"+ total);
		System.out.println("Expense :"+ expense);
		System.out.println("Income :"+ income);
		System.out.println("Divided 1 :"+ dividend1);
		System.out.println("Divided 2 :"+ dividend2);
		System.out.println("Divided 3 :"+ dividend3);
	}

	public static double extracted(double ValueOfSupply, double vatRate) {
		return ValueOfSupply*vatRate;
	}

}
