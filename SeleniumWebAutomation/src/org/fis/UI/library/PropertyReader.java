package org.fis.UI.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.fis.UI.base.BeginDriver;

public class PropertyReader {

	
	public static String  getPropertyData(String propname) throws Exception {

     Properties prop = new Properties(); 
     File f = new File("./Config/ApplicationConfigurations.properties"); 
     FileReader fr = new FileReader(f); 
     prop.load(fr);
     return prop.get(propname).toString(); 

	}
	
	
	
	public static String  getElementLocators(String propname) throws Exception {

	     Properties prop = new Properties(); 
	     File f = new File("./Config/elementlocator.properties"); 
	     FileReader fr = new FileReader(f); 
	     prop.load(fr);
	     return prop.get(propname).toString(); 

		}
	
	
	public static String  getExpectedvalue(String propname) throws Exception {

	     Properties prop = new Properties(); 
	     File f = new File("./Config/Expecteddata.properties"); 
	     FileReader fr = new FileReader(f); 
	     prop.load(fr);
	     return prop.get(propname).toString(); 

		}
		
	
}
