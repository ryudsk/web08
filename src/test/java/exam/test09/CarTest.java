package exam.test09;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	@Test
	public void carTest() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test09/beans.xml");
		
		Car car1 = (Car) ctx.getBean("car1");
		for (Tire tire : car1.getTires()) {
			System.out.println(tire);
		}
		
	}
}
