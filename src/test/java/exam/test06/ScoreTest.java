package exam.test06;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScoreTest {
	@Test
	public void scoreTest() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test06/beans.xml");
		
		Score score1 = (Score) ctx.getBean("score1");
		System.out.println(score1);
		Score score2 = (Score) ctx.getBean("score2");
		System.out.println(score2);
	}
}
