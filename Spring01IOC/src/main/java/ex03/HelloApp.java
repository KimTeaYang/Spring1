package ex03;

public class HelloApp {

	public static void main(String[] args) {
		
		//객체간의 결합력을 느슨하게 하는 방법
		//부모인터페이스 타입의 변수선언 = new 자식개체 생성();
		MessageBean mb1 = new MessageBeanKo();//new MessageBeanEn();
		mb1.sayHello("Peter");
		
	}

}