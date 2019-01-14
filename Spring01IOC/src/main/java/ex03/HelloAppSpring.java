package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		//DL(dependency Lookup)
		
		//classpath: => 클래스 파일이 있는 경로를 찾는다.
		// src/main/resources => 리소스파일(xml,properties)들을 두는데 
		// 해당 리소스 파일들은 클래스 파일(target/classes)이 있는 곳에 copy되어 위치한다. 
		String config = "classpath:applicationContext.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		MessageBean mb = (MessageBean)ctx.getBean("mb2");
		mb.sayHello("Spring");
		
	}

}
