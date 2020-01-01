package exam.test10;

import java.util.Map.Entry;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	@Test
	public void carTest() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test10/beans.xml");
		
		System.out.println("[properties type] ------------------------- ");
		Tire spareTire = (Tire) ctx.getBean("spareTire");
		for (Entry<Object,Object> entry : spareTire.getSpec().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("[Map type] -------------------------------- ");
		Car car1 = (Car) ctx.getBean("car1");
		for (Entry<String, Object> entry : car1.getOptions().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
}
