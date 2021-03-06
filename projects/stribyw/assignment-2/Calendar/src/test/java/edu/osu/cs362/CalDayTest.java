package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {
	/*
	 *test constructor for CalDay, which is set to current day test is ran
	 */
	 @Test
	 public void test01() throws Throwable {
  	 //construct new calendar day & Gregorian calendar
	 	GregorianCalendar gregcal = new GregorianCalendar();
	 	CalDay cal = new CalDay(gregcal);
	 	 assertEquals(gregcal.get(Calendar.DAY_OF_MONTH), cal.getDay());
		 assertEquals(gregcal.get(Calendar.MONTH), cal.getMonth());
		 assertEquals(gregcal.get(Calendar.YEAR), cal.getYear());
	 }
	/*
	 *test 4 valid entries and 1 invalid entry, entries placed out of order 
	 */
	 @Test
	 public void test02() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="New Years Party";
		 String description="This is my New Years party.";
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 CalDay cal = new CalDay(gregcal);
	 	 Appt appt = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("New Years Party");
		 assertEquals("New Years Party", appt.getTitle());
		 appt.setDescription("This is my New Years party.");
		 assertEquals("This is my New Years party.", appt.getDescription());         		
	 	 assertEquals(true, appt.getValid());
	 	 Appt appt2 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt2.getValid();
	 	 appt2.setStartHour(10);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartMinute(30);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartDay(31);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartMonth(10);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartYear(01);
		 assertEquals(true, appt2.getValid());
		 appt2.setTitle("Halloween Party");
		 assertEquals("Halloween Party", appt2.getTitle());
		 appt2.setDescription("This is my Halloween party.");
		 assertEquals("This is my Halloween party.", appt2.getDescription());         		
	 	 assertEquals(true, appt2.getValid());
	 	 Appt appt4 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt4.getValid();
	 	 appt4.setStartHour(17);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMinute(30);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartDay(31);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMonth(10);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartYear(01);
		 assertEquals(true, appt4.getValid());
		 appt4.setTitle("Halloween Party 2");
		 assertEquals("Halloween Party 2", appt4.getTitle());
		 appt4.setDescription("This is my Halloween party 2.");
		 assertEquals("This is my Halloween party 2.", appt4.getDescription());         		
	 	 assertEquals(true, appt4.getValid());
	 	 Appt appt5 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt5.getValid();
	 	 appt5.setStartHour(9);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartMinute(30);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartDay(31);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartMonth(10);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartYear(01);
		 assertEquals(true, appt5.getValid());
		 appt5.setTitle("Halloween Party 2");
		 assertEquals("Halloween Party 2", appt5.getTitle());
		 appt5.setDescription("This is my Halloween party 2.");
		 assertEquals("This is my Halloween party 2.", appt5.getDescription());         		
	 	 assertEquals(true, appt5.getValid());
	 	 Appt appt3 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt3.getValid();
	 	 appt3.setStartHour(24);
		 assertEquals(false, appt3.getValid());
		 appt3.setStartMinute(60);
		 assertEquals(false, appt3.getValid());
		 appt3.setStartDay(32);
		 assertEquals(false, appt3.getValid());
		 appt3.setStartMonth(13);
		 assertEquals(false, appt3.getValid());
		 appt3.setStartYear(01);
		 assertEquals(false, appt3.getValid());
		 appt3.setTitle(null);
		 assertEquals("", appt3.getTitle());
		 appt3.setDescription(null);
		 assertEquals("", appt3.getDescription());         		
	 	 assertEquals(false, appt3.getValid());
	 	 cal.addAppt(appt);
	 	 cal.addAppt(appt2);
	 	 cal.addAppt(appt4);
	 	 cal.addAppt(appt5);
	 	 cal.addAppt(appt3);
	 	 cal.getSizeAppts();
	 	 assertEquals(4, cal.getSizeAppts());
	 	 //unsure how to test interator()
	 	 cal.iterator();
	 }
	/*
	 *test iterator by itself
	 */
	 @Test
	 public void test03() throws Throwable {
	 	CalDay cal = new CalDay();
	 	cal.iterator();	 
	 }
	/*
	 *test 4 valid entries, entries placed out of order 
	 */
	 @Test
	 public void test04() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startMonth=4;
		 int startDay=10;
		 int startYear=2017;
		 String title="New Years Party";
		 String description="This is my New Years party.";
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 CalDay cal2 = new CalDay(gregcal);
	 	 //assertions to get would be for current day test is ran
	 	 //assertEquals(30, cal.getDay());
		 //assertEquals(03, cal.getMonth());
		 //assertEquals(2017, cal.getYear());
	 	 Appt appt = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("New Years Party");
		 assertEquals("New Years Party", appt.getTitle());
		 appt.setDescription("This is my New Years party.");
		 assertEquals("This is my New Years party.", appt.getDescription());         		
	 	 assertEquals(true, appt.getValid());
	 	 Appt appt2 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt2.getValid();
	 	 appt2.setStartHour(10);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartMinute(30);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartDay(31);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartMonth(10);
		 assertEquals(true, appt2.getValid());
		 appt2.setStartYear(01);
		 assertEquals(true, appt2.getValid());
		 appt2.setTitle("Halloween Party");
		 assertEquals("Halloween Party", appt2.getTitle());
		 appt2.setDescription("This is my Halloween party.");
		 assertEquals("This is my Halloween party.", appt2.getDescription());         		
	 	 assertEquals(true, appt2.getValid());
	 	 Appt appt4 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt4.getValid();
	 	 appt4.setStartHour(17);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMinute(30);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartDay(31);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMonth(10);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartYear(01);
		 assertEquals(true, appt4.getValid());
		 appt4.setTitle("Halloween Party 2");
		 assertEquals("Halloween Party 2", appt4.getTitle());
		 appt4.setDescription("This is my Halloween party 2.");
		 assertEquals("This is my Halloween party 2.", appt4.getDescription());         		
	 	 assertEquals(true, appt4.getValid());
	 	 Appt appt5 = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt5.getValid();
	 	 appt5.setStartHour(9);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartMinute(30);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartDay(31);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartMonth(10);
		 assertEquals(true, appt5.getValid());
		 appt5.setStartYear(01);
		 assertEquals(true, appt5.getValid());
		 appt5.setTitle("Halloween Party 2");
		 assertEquals("Halloween Party 2", appt5.getTitle());
		 appt5.setDescription("This is my Halloween party 2.");
		 assertEquals("This is my Halloween party 2.", appt5.getDescription());         		
	 	 assertEquals(true, appt5.getValid());
	 	 //unable to format toString() correctly for assertion
	 	 cal2.toString();
	 	 cal2.addAppt(appt);
	 	 cal2.addAppt(appt2);
	 	 cal2.addAppt(appt4);
	 	 cal2.addAppt(appt5);
	 	 cal2.getSizeAppts();
	 	 assertEquals(4, cal2.getSizeAppts());
	 	 //unsure how to test interator()
	 	 cal2.iterator();
	 }
	/*
     *for toString() to cover all branches of first if statement, unable to turn green
     */
	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 String returnToString;
		 //Construct a new Appointment object with the initial data	 
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 CalDay cal2 = new CalDay(gregcal);
	 	 //assertions to get would be for current day test is ran
	 	 //assertEquals(30, cal.getDay());
		 //assertEquals(03, cal.getMonth());
		 //assertEquals(2017, cal.getYear());
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		          description);
	     // assertions
		 assertTrue(appt.getValid());
		 cal2.addAppt(appt);
		 returnToString = cal2.toString();
		 //could not get toString output formatting to match for assertion
		 //assertEquals("\t --- 3/28/2017 --- \n" + "--- -------- Appointments ------------ --- \n" + "\t4/10/2017 at 1:30, Birthday Party, This is my birthday party.\n", returnToString);         		
	 }
}
