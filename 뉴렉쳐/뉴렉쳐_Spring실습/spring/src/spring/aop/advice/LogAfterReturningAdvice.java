package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// 함수가 호출되고나서의 반환값이 메서드의 파라미터로 들어온다.
		
		System.out.println("returnValue : " + returnValue + ", method : " + method.getName());
		
	}

}
