package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	static Properties prp= null;
	
	/**
	 * This method is used to initialize the property file
	 * @throws IOException
	 */
	public static void initalizeProperty() throws IOException{
		
		
		FileInputStream fis= new FileInputStream(ConstantPath.propertyFile);
		prp= new Properties();
		prp.load(fis);
	}
		
	/**
	 * This method is used to get the data from the property file
	 * @param value
	 * @return
	 */
		public static String getPropertyData(String value){
		
		String data = prp.getProperty(value);
		
		return data;
	}
		
}
	
		
	
	
	

	


