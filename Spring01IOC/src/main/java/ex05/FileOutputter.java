package ex05;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	
	private String path;

	@Override
	public void output(String str) throws IOException {
		FileWriter fw = new FileWriter(path,true);
		fw.write(str);
		fw.flush();
		fw.close();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
