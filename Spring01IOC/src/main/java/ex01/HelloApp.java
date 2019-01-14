package ex01;

public class HelloApp {

	public static void main(String[] args) {
		
		//HelloApp은 MessageBean에 의존성(dependency)을 갖는다.
		//HelloApp users MessageBean
		//MessageBean mb1 = new MessageBean();
		MessageBeanKo mb1 = new MessageBeanKo();
		mb1.sayHello("TOM");
		
	}

}
