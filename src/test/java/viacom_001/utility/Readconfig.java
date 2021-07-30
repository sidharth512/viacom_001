package viacom_001.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	public Readconfig() {
		File src=new File(".\\ConfitFile\\config");
		try {
			FileInputStream fis	=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String geturl() {
		 String url=pro.getProperty("baseURL");
		return url; 
	}
	public String searchObject() {
		 String object=pro.getProperty("name");
		return object;
	}
	public String chromepath() {
		String Cdriver=pro.getProperty("Chromedriver");
		return Cdriver;
	}
	public String EdgePath() {
		String Edriver=pro.getProperty("edgeDriver");
		return Edriver;
	}
	
	}


