package ex03;

public class MessageBeanEn implements MessageBean {

	//interface를 상속받은 자식 클래스에서는 추상메소드를 강제로 재정의해야 함
	@Override
	public void sayHello(String name) {
		System.out.println("Hello~~"+name+"!!");
	}

}
