package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\Automation\\BasicCoreJava\\src\\fileHandling\\OR.Properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		System.out.println(prop.get("name"));
		
		
	

	}

}
