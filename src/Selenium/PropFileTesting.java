package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFileTesting {
	 public static void main(String[] args) throws IOException {
	
		 
	File  propFile = new File("Resources\\config.properties");
	Properties prop = new Properties();
	FileInputStream fis =  new FileInputStream(propFile);
	prop.load(fis);
	
	System.out.println(prop.getProperty("userName"));

}
}
