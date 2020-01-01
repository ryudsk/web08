package exam.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test01/beans.xml");
		
		Score score = (Score) ctx.getBean("score");
		
		System.out.println("sum : " + score.sum());
		System.out.println("avg : " + score.average());
	}
}
