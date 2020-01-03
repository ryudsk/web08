package exam.test18;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	@Test
	public void carTest() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test18/beans.xml");
		
		Car car1 = (Car) ctx.getBean("car1");
		
		System.out.println(car1.getEngine());
	}
}
