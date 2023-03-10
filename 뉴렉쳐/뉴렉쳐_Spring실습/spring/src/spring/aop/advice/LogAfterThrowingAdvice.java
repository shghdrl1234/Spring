package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	// 다른 Advice 인터페이스는 인자가 주어지는 반면에
	// ThrowingAdvice가 구현할 함수는 정해져있지 않다.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("예외가 발생하였습니다. : " + e.getMessage());

	
	}

}
