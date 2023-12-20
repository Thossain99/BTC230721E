package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Shared {

	public void click() {
		System.out.println("element clicked");
		
	}
	
	public static Properties readPropFile(String path) throws IOException {
		FileInputStream fi = new FileInputStream(new File(path));
		
		Properties prop = new Properties();
		
		prop.load(fi);
		
		return prop;
	}
}

