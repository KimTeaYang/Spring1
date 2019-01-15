package ex04;

import java.util.Date;

public class MessageBeanImpl implements MessageBean {
	
	//setter 통해 주입
	private String greeting; //property, instance variable
	private String name;
	
	//생성자 통해 주입
	private String msg;
	private int money;
	
	private Date today;
	
	public MessageBeanImpl() {
		super();
	}

	public MessageBeanImpl(String msg, int money) {
		super();
		this.msg = msg;
		this.money = money;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		if(today!=null) {
			System.out.println(today.toString());
		}
		System.out.println(greeting+" "+name+"~~");
	}

	@Override
	public void sayHi(String... args) {
		if(args!=null) {
			for(String name:args) {
				System.out.println(name+"님~ "+msg+" >> "+money+"원 내놔~");
			}
		}
	}

}
