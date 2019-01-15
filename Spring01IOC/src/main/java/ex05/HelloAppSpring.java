package ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		
		String config = "classpath:appContext3.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		MessageBean mb = ctx.getBean("mb",MessageBean.class);
		mb.sayHi("태양","태준","태호");

	}

}
