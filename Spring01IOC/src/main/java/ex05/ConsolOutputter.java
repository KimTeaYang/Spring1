package ex05;

import java.io.IOException;

public class ConsolOutputter implements Outputter {
	
	private String path;

	@Override
	public void output(String str) throws IOException {
		System.out.println(path);
		System.out.println(str);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
