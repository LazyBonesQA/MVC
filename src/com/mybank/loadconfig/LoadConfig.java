package com.mybank.loadconfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfig {
	
	public String readProperties(String keyProp, String pathToConfig) {
		Properties prop = new Properties();
		InputStream input = null;
		String valueProp = null;

		try {
			input = new FileInputStream(pathToConfig);
			prop.load(input);
			valueProp = prop.getProperty(keyProp);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return valueProp;
	}
}