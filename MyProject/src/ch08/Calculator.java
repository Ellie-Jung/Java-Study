package ch08;

interface Calculator{ //Calculator 인터페이스 정의
	long add (long n1, long n2);
	long substract(long n1, long n2);
	long multuply(long n1, long n2);
	double divide(double n1, double n2);
}

abstract class Calculatorab implements Calculator{ //Calculator인터페이스를 상속받는 추상클래스 정의
	
	
}
