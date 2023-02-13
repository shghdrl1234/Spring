package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// 만약에 구현하는데 있어서 현재 노출되는 함수의 이름, 함수의 파라미터를 가져오고 싶으면
		// 위의 파라미터를 활용하면됨. 타겟 객체도 가능.
		// 하지만, 이 안에서 결부되지 않는 로직을 쓰고 싶으면 그냥 쓰면됨.
		// DB파일, 로컬 파일 등
		System.out.println("앞에서 실행될 로직 ");
		
		
	}

}
