package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		
		/* Spring에서는 이렇게 안함
		 * MessageBean mb = new MessageBeanImpl();
		((MessageBeanImpl)mb).setGreeting("hi");
		((MessageBeanImpl)mb).setName("Tom");
		mb.sayHello();*/
		
		String config = "classpath:appContext2.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		MessageBean mb = (MessageBean)ctx.getBean("mb1");
		mb.sayHello();
		
		MessageBean mb2 = ctx.getBean("mb2",MessageBean.class);
		mb2.sayHello();
		mb2.sayHi("sun","kim","tae");
		
		MessageBean mb3 = ctx.getBean("mb3",MessageBean.class);
		mb3.sayHello();
		
	}

}
