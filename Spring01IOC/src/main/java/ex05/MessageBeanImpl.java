package ex05;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean{

	private String msg;
	private int money;
	
	private Outputter out; // 참조형 property
	
	@Override
	public void sayHi(String... args) {
		if(args!=null) {
			for(String arg:args) {
				//System.out.println(arg+"님아 ~~"+msg+">>"+money+"원만~~");
				try {
					out.output(arg+"님아 ~~"+msg+">>"+money+"원만~~\r\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Outputter getOut() {
		return out;
	}
	
	public void setOut(Outputter out) {
		this.out = out;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
