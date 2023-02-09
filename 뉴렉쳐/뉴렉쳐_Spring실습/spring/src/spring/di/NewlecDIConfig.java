package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	
	// 컨테이너 안에서 id로 사용하기 위한 네이밍을 해야함.
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
