
public class WhyMethod {
//	public static void printTwoTimesA() {
//		System.out.println("-");
//		System.out.println("A");
//		System.out.println("a");
//	}
	public static void main(String[] args) {
		
//		printTwoTimesA();
//		printTwoTimesA();
//		printTwoTimesA();
				//인자, argument
		printTwoTimes("a","#");
		System.out.println(twoTimes("a", "#"));
		printTwoTimes("b","*");
		printTwoTimes("c","&");

	}
							//매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
}
	public static String  twoTimes(String text, String delimiter) {
		String out ="";
		out = out + delimiter +"\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}

}
