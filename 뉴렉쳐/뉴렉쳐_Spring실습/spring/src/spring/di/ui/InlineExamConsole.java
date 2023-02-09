package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

// @Component 
// 단순히 Component만 있으면 에러발생, xml 파일에서 해당 객체가 없다.
// 해당 객체를 읽을 수 있도록 패키지를 추가해줘야한다.
// 또한 Program.java에서 console 변수가 참조하는 객체가 Bean의 이름을 참조하고 있다면, 
// Component뒤에 그 이름을 적어주면 된다.
@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired()
	@Qualifier("exam")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null)
		System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}
