package exam.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test03/beans.xml");
		
		
		System.out.println("::print container object name::");
		for (String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		System.out.println("::get alias::");
		for (String alias : ctx.getAliases("exam.test03.Score#0")) {
			System.out.println(alias);
		}
		
		System.out.println("::get anonymous beans::");
		Score score1 = (Score) ctx.getBean("exam.test03.Score");
		Score score2 = (Score) ctx.getBean("exam.test03.Score#0");
		if (score1 == score2) System.out.println("score == score#0");
		
		Score score3 = (Score) ctx.getBean("exam.test03.Score#1");
		if (score1 != score3) System.out.println("score != score#1");
		
		System.out.println("::get Beans with class type::");
		Score score4 = (Score) ctx.getBean(exam.test03.Score.class);
	}
}
