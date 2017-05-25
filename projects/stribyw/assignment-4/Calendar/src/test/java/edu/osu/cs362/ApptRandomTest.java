package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import org.junit.Test;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 120 seconds */
	private static final int NUM_TESTS=500;
	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        //given
    	//String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class
		//manipulated
		String[] methodArray = new String[] {"setStartHourLower", "setStartHour", "setStartHourUpper", "setStartMinuteLower", "setStartMinute", "setStartMinuteUpper", "setStartDayLower", "setStartDay", "setStartDayUpper", "setStartMonthLower", "setStartMonth", "setStartMonthUpper", "setDescription"};// The list of the of methods to be tested in the Appt class
		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
        return methodArray[n] ; // return the method name 
	}
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing...");


			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
				Random random = new Random(randomseed);
				 int startHour=13;
				 int startMinute=30;
				 int startDay=10;
				 int startMonth=4;
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setDescription")){
						   String newDescription = (String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);
						}
					   else if (methodName.equals("setStartHourLower")){
						   int newHour = (int)ValuesGenerator.getRandomIntBetween(random, -100, -1);
						   appt.setStartHour(newHour);
					   }
					    else if (methodName.equals("setStartHour")){
					   		int newHour = (int)ValuesGenerator.getRandomIntBetween(random, 0, 23);
					   		appt.setStartHour(newHour);
					   }
					   else if (methodName.equals("setStartHourUpper")){
						   int newHour = (int)ValuesGenerator.getRandomIntBetween(random, 24, 50);
						   appt.setStartHour(newHour);
					   }
					   else if (methodName.equals("setStartMinuteLower")){
						   int newMinute = (int)ValuesGenerator.getRandomIntBetween(random, -60, -1);
						   appt.setStartMinute(newMinute);
					   }
						else if (methodName.equals("setStartMinute")){
							int newMinute = (int)ValuesGenerator.getRandomIntBetween(random, 0, 59);
							appt.setStartMinute(newMinute);
						}
					   else if (methodName.equals("setStartMinuteUpper")){
						   int newMinute = (int)ValuesGenerator.getRandomIntBetween(random, 60, 120);
						   appt.setStartMinute(newMinute);
					   }
					   else if (methodName.equals("setStartDayLower")) {
						   int newDay = (int) ValuesGenerator.getRandomIntBetween(random, -31, 0);
						   appt.setStartDay(newDay);
					   }
					   else if (methodName.equals("setStartDay")) {
						   int newDay = (int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
						   appt.setStartDay(newDay);
					   }
					   else if (methodName.equals("setStartDayUpper")) {
						   int newDay = (int) ValuesGenerator.getRandomIntBetween(random, 32, 62);
						   appt.setStartDay(newDay);
					   }
					   else if (methodName.equals("setStartMonthLower")) {
						   int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, -12, 0);
						   appt.setStartMonth(newMonth);
					   }
						else if (methodName.equals("setStartMonth")) {
						   int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
						   appt.setStartMonth(newMonth);
					   }
					   else if (methodName.equals("setStartMonthUpper")) {
						   int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, 13, 26);
						   appt.setStartMonth(newMonth);
					   }
				}
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		    }
		    System.out.println("Done testing...");
	  }		//comment above


	
}
