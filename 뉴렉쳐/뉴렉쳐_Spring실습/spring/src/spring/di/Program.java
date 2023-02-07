package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		
			//Exam exam = new NewlecExam();
			/*
			 * exam 이라는 객체를 주입하면서 결과가 달라지고 있음.
			 */
			//ExamConsole console = new InlineExamConsole(exam); // DI
			//ExamConsole console = new GridExamConsole(exam);
			// 현재는 코드를 작성했지만, 코드를 작성안하고 외부에서 해주는 작업은
			// Spring에서 가능하다.

		/* 결론 : 스프링에게 지시하는 방법으로 코드를 변경한다.
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(); // 기본 생성자로 의존성 주입 하기 위한 코드
		
		console.setExam(exam);
		==========================================
		원인 : exam 이나 console 객체가 바뀌게 되면, 결합관계도 바뀌어야한다.
		이 주석 안에 있는 코드들은 바뀌어야함.
		
		우리에게는 아래에 살아있는 console.print()를 실행시키기 위한 console 객체가 필요하다.
		ExamConsole console = ? 이 console 객체를 누군가가 (다른 곳에서) 설정해줘야함.
		=> 즉, 위의 코드들을 설정으로 뺀 후, 객체화 해서 전달해주는 누군가가 있어야한다.
		=> 그게 Spring의 역할이다.
		=> Spring의 기능을 이용해서 위 코드의 관계를 분리한다! 라고 이해하면됨.
		*/
		
		ExamConsole console = ?
		
		console.print();
		
	}

}
