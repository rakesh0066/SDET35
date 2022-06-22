package Com.Crm.GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Rakesh
 *
 */

public class FileUtility {
	public FileInputStream fileInputStream;
	/**
	 * it is used to get common data from property file based on key which you have specified as a argument
	 * @return
	 */

	public String getPropertyKeyValue(String key)throws Throwable{
		fileInputStream = new FileInputStream("./src/test/resources/VtigerResources.Properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String value = prop.getProperty(key);
		return value;
	}
	
	public void closeFile() throws Throwable {
		fileInputStream.close();
	}

}
