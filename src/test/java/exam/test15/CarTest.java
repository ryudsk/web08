package exam.test15;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	@Test
	public void carTest() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test15/beans.xml");
		
		System.out.println("Using Instance factory method - ");
		SimpleDateFormat dateFormat =  (SimpleDateFormat) ctx.getBean("dateFormat");
		
		Tire hankookTire = (Tire) ctx.getBean("hankookTire");
		System.out.println(hankookTire.getMaker());
		System.out.println(dateFormat.format(hankookTire.getCreatedDate()));
		
		System.out.println("------------------------------- ");
		
		Tire kumhoTire = (Tire) ctx.getBean("kumhoTire");
		System.out.println(kumhoTire.getMaker());
		System.out.println(dateFormat.format(kumhoTire.getCreatedDate()));
	}
}
