package ch09;

public class Ex9_8 {
	static double round(double d , int n) { //주어진 값을 반올림하여, 소수점 이하 n자리의 값을 반환한다.
		//Math.pow(double a, double b)는 a의 b제곱을 반환한다. 10의 3제곱은 Math.pow(10,3)
		//Math.round()가 소수점 첫 째 자리에서 반올림하기 때문에, 소수점 n+1째자리에서 반올림해서 소수점 n째 자리로 만들려면 
		//10의n제곱을 곱한다음에 반올림하고 다시 10의 n제곱으로 나눠줘야 한다.  
		
		return Math.round(d*Math.pow(10,n))/Math.pow(10,n);
		
	} 
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));


	}

}
