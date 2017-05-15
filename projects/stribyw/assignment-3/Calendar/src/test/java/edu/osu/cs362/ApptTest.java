package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
import edu.osu.cs362.Appt;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


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
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(13);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
		 assertTrue(appt.getValid());        		
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
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
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
	 	 //appt.toString();
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
		 assertEquals("Morning", title);
		 String description="This is my morning test.";
		 assertEquals("This is my morning test.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 //assertions
		 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
		 assertTrue(appt.getValid());
		 //appt.toString();
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
		 assertEquals("Midnight", title);
		 String description="This is my midnight test.";
		 assertEquals("This is my midnight test.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
		 assertTrue(appt.getValid());
		 //appt.toString(); 
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
		 assertEquals("Evening", title);
		 String description="This is my evening test.";
		 assertEquals("This is my evening test.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(17);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
		 assertTrue(appt.getValid());
		 //appt.toString(); 
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
		 assertEquals("New Years Party", title);
		 String description="This is my New Years party.";
		 assertEquals("This is my New Years party.", description);
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
	 	 //appt.toString();
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
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
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
	 	 //appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
	/*
	 *testing isValid() through setStartMinute() 
	 */
	 @Test
	 public void test08() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(23);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(59);
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
	 	 //appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
 	/*
	 *testing isValid() through setStartDay()
	 */
	 @Test
	 public void test09() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
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
	 	 //appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
 	/*
	 *testing isValid()
	 */
	 @Test
	 public void test10() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
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
		 appt.setStartMonth(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertTrue(appt.getValid());
	 	 //appt.toString();
	 	 //could not get formatting for toString() output for assertion

	 }
	/*
	 *testing another valid entry()
	 */
	 @Test
	 public void test11() throws Throwable {
		 int startHour=13;
		 //assetEquals(13, startHour); 	//added
		 int startMinute=30;
		 //assetEquals(30, startMinute); 
		 int startDay=10;
		 //assetEquals(10, startDay); 
		 int startMonth=4;
		 //assetEquals(4, startMonth); 
		 int startYear=2017;
		 //assetEquals(2017, startYear); 
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 	 // assertions
		 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertTrue(appt.getValid());
	 	 appt.toString();
	 	 assertEquals("\t1/1/1 at 1:1am ,, \n", appt.toString());
	 } 
	/*
	 *testing bottom edges for hour and minute()
	 */
	 @Test
	 public void test12() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 	 // assertions
		 appt.setStartHour(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertTrue(appt.getValid());
	 	 appt.toString();
	 	 assertEquals("\t1/1/1 at 12:0am ,, \n", appt.toString());
	 } 
	/*
	 *testing bottom edges for hour and minute()
	 */
	 @Test
	 public void test13() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 assertEquals("Birthday Party", title);
		 String description="This is my birthday party.";
		 assertEquals("This is my birthday party.", description);
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 	 // assertions
		 appt.setStartHour(23);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertTrue(appt.getValid());
	 	 appt.toString();
	 	 assertEquals("\t1/1/1 at 11:0pm ,, \n", appt.toString());
	 } 
}
