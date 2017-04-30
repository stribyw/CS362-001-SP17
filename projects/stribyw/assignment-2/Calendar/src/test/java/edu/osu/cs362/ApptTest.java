package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /*
     *Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	/*
	 *Test set-ers, invalid entries for isValid that's accessed through set-ers,
	 *if null cases for title and description set-ers.
	 */
	 @Test
	 public void test02() throws Throwable {
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
		 //assertions
		 appt.setStartHour(24);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(60);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(32);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(32);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(32);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
	/*
	 *Test morning case in toString function
	 */
	 @Test
	 public void test03() throws Throwable {
		 int startHour=10;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Morning";
		 String description="This is my morning test.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 //assertions
		 assertTrue(appt.getValid());
		 assertEquals(10, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Morning", appt.getTitle());
		 assertEquals("This is my morning test.", appt.getDescription());
		 appt.toString();
		 //could not get formatting for toString() output for assertion
 
	 }
	/*
	 *Test midnight case in toString function
	 */
	 @Test
	 public void test04() throws Throwable {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Midnight";
		 String description="This is my midnight test.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(0, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Midnight", appt.getTitle());
		 assertEquals("This is my midnight test.", appt.getDescription());
		 appt.toString(); 
		 //could not get formatting for toString() output for assertion
	 }
	/*
	 *Test evening case in toString function
	 */
	 @Test
	 public void test05() throws Throwable {
		 int startHour=17;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Evening";
		 String description="This is my evening test.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(17, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Evening", appt.getTitle());
		 assertEquals("This is my evening test.", appt.getDescription());
		 appt.toString(); 
		 //could not get formatting for toString() output for assertion

	 }
	/*
	 *Testing another valid entry
	 */
	 @Test
	 public void test06() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="New Years Party";
		 String description="This is my New Years party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(07);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(34);
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
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
	/*
	 *testing a complete invalid entry
	 */
	 @Test
	 public void test07() throws Throwable {
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
		 // assertions
		 appt.setStartHour(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(32);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
	/*
	 *testing isValid() through setStartHour() 
	 */
	 @Test
	 public void test08() throws Throwable {
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
		 // assertions
		 appt.setStartHour(12);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(32);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
 	/*
	 *testing isValid() through setStartMinute()
	 */
	 @Test
	 public void test09() throws Throwable {
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
		 // assertions
		 appt.setStartHour(12);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(2);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(32);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
 	/*
	 *testing isValid() through setStartDay()
	 */
	 @Test
	 public void test10() throws Throwable {
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
	 	 // assertions
		 appt.setStartHour(12);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(0);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	 	 appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 } 
}
