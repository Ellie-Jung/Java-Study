package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;
// 실행중 예외 발생시
public class LogAfterThrowingAdvice implements ThrowsAdvice{ //예외에 따라 함수 인자 달라지기때문에 구현할것 따로 정의없음
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{ //여기 인자로 들어가는예외 다양
		System.out.println("예외가 발생하셨습니다. : " + e.getMessage());
		
	}
	
	
}
