package exam.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test02/beans.xml");
		
		
		System.out.println("::print container object name::");
		for (String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("::score2 alias::");
		for (String alias : ctx.getAliases("score2")) {
			System.out.println(alias);
		}
		
		// name = "score"
		Score score = (Score) ctx.getBean("score");
		
		// name = "score2, score3, score4"
		Score score2 = (Score) ctx.getBean("score2");
		Score score3 = (Score) ctx.getBean("score3");
		Score score4 = (Score) ctx.getBean("score4");
		
		// name = "score-ok"
		Score scoreOk = (Score) ctx.getBean("score-ok");
		
		System.out.println("::get Beans::");
		if (score != null) System.out.println("find score");
		if (score2 != null) System.out.println("find score2");
		if (score3 != null) System.out.println("find score3");
		if (score4 != null) System.out.println("find score4");
		if (scoreOk != null) System.out.println("find score-ok");
		
		System.out.println("::Compare with Beans::");
		if (score == score2) System.out.println("score == score2"); //fail
		if (score2 == score3) System.out.println("score2 == score3"); //success
		if (score3 == score4) System.out.println("score3 == score4"); //success
		if (score4 == scoreOk) System.out.println("score4 == scoreOk"); //fail
	}
}
