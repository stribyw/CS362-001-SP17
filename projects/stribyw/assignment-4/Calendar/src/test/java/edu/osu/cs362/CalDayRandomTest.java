package edu.osu.cs362;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; 	/* Timeout at 120 seconds */
	/**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing...");
		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 Random random = new Random(randomseed);
			 int startHour = 13;
			 int startMinute = 30;
			 int startDay = 10;
			 int startMonth = 4;
			 int startYear = 2017;
			 String title = "Birthday Party";
			 String description = "This is my birthday party.";
			 GregorianCalendar gregcal = new GregorianCalendar();
			 CalDay cal = new CalDay(gregcal);
			 assertEquals(gregcal.get(Calendar.DAY_OF_MONTH), cal.getDay());
			 assertEquals(gregcal.get(Calendar.MONTH), cal.getMonth());
			 assertEquals(gregcal.get(Calendar.YEAR), cal.getYear());
			 for (int i = 0; i < 500; i++) {
				 Appt appt = new Appt(
						 startHour,
						 startMinute,
						 startDay,
						 startMonth,
						 startYear,
						 title,
						 description
				 );
				 if (i % 2 == 0) {
					 int newHour = (int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
					 appt.setStartHour(newHour);
					 int newMinute = (int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
					 appt.setStartMinute(newMinute);
					 int newDay = (int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
					 appt.setStartDay(newDay);
					 int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
					 appt.setStartMonth(newMonth);
				 } else {
					 int newHour = (int) ValuesGenerator.getRandomIntBetween(random, -23, 46);
				     appt.setStartHour(newHour);
					 int newMinute = (int)ValuesGenerator.getRandomIntBetween(random, -60, 60);
					 appt.setStartMinute(newMinute);
					 int newDay = (int) ValuesGenerator.getRandomIntBetween(random, -32, 63);
					 appt.setStartDay(newDay);
					 int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, -13, 25);
					 appt.setStartMonth(newMonth);
			     }
				 int newYear = (int) ValuesGenerator.getRandomIntBetween(random, 1983, 2017);
				 appt.setStartYear(newYear);
				 appt.getValid();
				 cal.addAppt(appt);
			 }
			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		 }
		 System.out.println("Done testing...");
	 }	//comment above
}
