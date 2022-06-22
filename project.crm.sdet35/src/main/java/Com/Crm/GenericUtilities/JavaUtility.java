package Com.Crm.GenericUtilities;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Rakesh
 *
 */

public class JavaUtility {
	/**
	 * its used to generate a random number with in the range of 1000
	 * 
	 * 
	 */

   public int getRandomNumber() {
	   Random random= new Random();
	   int randNum = random.nextInt(1000);
	   return randNum;
	   
	}
   public String getSystemDateAndTimeInISTformatString() {
	   Date date = new Date();
	   return date.toString();
	   
   }
   /**
    * its used to get the current system date based on YYYY-MM-DD format
    * @return
    * 
    */
   
	public String  getSystemDate() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String format = yyyy+"-"+mm+"-"+dd;
			return format;
	}

	/**  its used to get the current system date based on DD-MM-YYYY format 
	 * @return
	 */
	public String  getSystemDateInIST() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String format = dd+"-"+mm+"-"+yyyy;
			return format;
	}
	

}
