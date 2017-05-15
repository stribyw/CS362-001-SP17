package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class CalDayTest {
	/*
	 *test constructor for CalDay, and default constructor
	 */
	 @Test
	 public void test01() throws Throwable {
  	 //construct new calendar day & Gregorian calendar
	 	GregorianCalendar gregcal = new GregorianCalendar();
	 	CalDay cal = new CalDay(gregcal);
	 	assertTrue(cal.isValid());
	 	cal.iterator();
	 	assertNotNull(cal.iterator());
	 	CalDay calFail = new CalDay();
		assertFalse(calFail.isValid());
	 }
	/*
	 *test vaild entry and toString()
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
	 	 assertTrue(cal.isValid());
	 	 Appt appt = new Appt(
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 cal.addAppt(appt);
	 	 String calApptString = cal.toString();
	 	 String convert = (appt.getStartHour() > 11) ? "pm" : "am";
        	int printableHour = appt.getStartHour();
        	if (printableHour > 11)
        	{
            	printableHour -= 12;
        	}
        	if (printableHour == 0)
        	{
            	printableHour = 12;
        	}
        	String printableHourString = String.valueOf(printableHour);
        	String dateTime = appt.getStartMonth() + "/" + appt.getStartDay() + "/" + appt.getStartYear()
        		+ " at " + printableHour + ":" + appt.getStartMinute() + convert;
        	assertEquals("\t --- " + cal.getMonth() + "/" + cal.getDay() + "/" + cal.getYear() + " --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t" + dateTime + " ,New Years Party, This is my New Years party.\n \n", calApptString);
	 }
	/*
	 *test iterator by itself
	 */
	 @Test
	 public void test03() throws Throwable {
	 	CalDay cal = new CalDay();
	 	assertFalse(cal.isValid());
	 	cal.iterator();	 
	 }
	/*
	 *test entry of appt after entry input, adjust start minute, and test toString() output 
	 */
	@Test
        public void test04() throws Throwable  {
            int startHour=13;
            int startMinute=30;
            int startDay=10;
            int startMonth=6;
            int startYear=2017;
            String title="Birthday Party";
            String description="This is a Birthday Party";
            Appt appt = new Appt(startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2017);
            gregcal.set(GregorianCalendar.MONTH, 5);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 14);
            CalDay calday = new CalDay(gregcal);
            startMinute=56;
            Appt appt1 = new Appt(
  	            		 startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            calday.addAppt(appt);
            calday.addAppt(appt1);
            String TEMP = calday.toString();
            TEMP = TEMP.replace("\n","");
            assertEquals("\t --- 5/14/2017 ---  --- -------- Appointments ------------ --- \t6/10/2017 at 1:30pm ,Birthday Party, This is a Birthday Party \t6/10/2017 at 1:56pm ,Birthday Party, This is a Birthday Party ",TEMP);
        }
	/*
	 *create calday, linked list, and two appts. verify one appt not valid
	 */
	 @Test
     	public void test05()  throws Throwable  {
      		CalDay calDay0 = new CalDay();
      		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      		calDay0.appts = linkedList0;
      		Appt appt0 = new Appt(1, 3, 1, 3, 3, (String) null, "appt0 entry");
      		Appt appt1 = new Appt(1, 1, 3, 1, 3, "", "");
      		linkedList0.addFirst(appt0);
      		appt1.setStartHour(31);
      		linkedList0.add(appt1);
      		calDay0.addAppt(appt0);
      		assertFalse(calDay0.isValid());
  		}
  	/*
  	 *create calday, linked list, two appts (one invalid), verify start hour
  	 *of one appt valid.
  	 */
     @Test
  		public void test06()  throws Throwable  {
		      CalDay calDay0 = new CalDay();
		      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		      calDay0.appts = linkedList0;
		      Appt appt0 = new Appt(0, 2300, 2400, 2, 800, (String) null, (String) null);
		      linkedList0.add(appt0);
		      Appt appt1 = new Appt(1, 3, 1, 3, 3, (String) null, "appt1 stuff");
		      linkedList0.add(appt1);
		      calDay0.addAppt(appt1);
		      assertEquals(1, appt1.getStartHour());
        }
    /*
  	 *create calday, linked list, appt, verify year now
  	 */
     @Test
  		public void test07()  throws Throwable  {
		      GregorianCalendar GregorianCalendar1 = new GregorianCalendar();
		      CalDay calDay = new CalDay((GregorianCalendar) GregorianCalendar1);
		      calDay.year = (2017);
		      int yearNow = calDay.getYear();
		      assertEquals((2017), yearNow);
  		}
    /*
  	 *create calday, linked list, appt, verify size
  	 */
     @Test
        public void test08()  throws Throwable  {
      		CalDay calDay0 = new CalDay();
      		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      		calDay0.appts = linkedList0;
      		int int0 = calDay0.getSizeAppts();
      		assertEquals(0, int0);
  		}
    /*
  	 *create calday, linked list, appt, verify size
  	 */
     @Test
  		public void test09()  throws Throwable  {
      		CalDay calDay0 = new CalDay();
      		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      		calDay0.appts = linkedList0;
      		Appt appt0 = new Appt(1, 3, 1, 3, 3, (String) null, "String");
      		linkedList0.add(appt0);
      		int int0 = calDay0.getSizeAppts();
      		assertEquals(1, int0);
  		}
	/*
	 *test entry after another and adjust the start hour to before, and test toString() output
	 */
	@Test
        public void test10() throws Throwable  {
            int startHour=13;
            int startMinute=30;
            int startDay=10;
            int startMonth=5;
            int startYear=2017;
            String title="Appt Entry";
            String description="This is an appt entry";
            Appt appt = new Appt(startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2017);
            gregcal.set(GregorianCalendar.MONTH, 5);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
            CalDay calday = new CalDay(gregcal);
            startHour=1;
            Appt appt1 = new Appt(startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            calday.addAppt(appt);
            calday.addAppt(appt1);
		    String TEMP = calday.toString();
            TEMP = TEMP.replace("\n","");
            assertEquals("\t --- 5/13/2017 ---  --- -------- Appointments ------------ --- \t5/10/2017 at 1:30am ,Appt Entry, This is an appt entry \t5/10/2017 at 1:30pm ,Appt Entry, This is an appt entry ",TEMP);
        }
    /*
	 *test similar as before, but adjust starthour to after
	 */
	@Test
	 	public void test11() throws Throwable	{
			int startHour=13;
            int startMinute=30;
            int startDay=10;
            int startMonth=5;
            int startYear=2017;
            String title="Appt Entry";
            String description="This is an appt entry";
            Appt appt = new Appt(startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2017);
            gregcal.set(GregorianCalendar.MONTH, 5);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
            CalDay calday = new CalDay(gregcal);
            startHour=20;
            Appt appt1 = new Appt(startHour,
                         startMinute ,
                         startDay ,
                         startMonth ,
                         startYear ,
                         title,
                         description);
            calday.addAppt(appt);
            calday.addAppt(appt1);
	    	String TEMP = calday.toString();
            TEMP = TEMP.replace("\n","");
            assertEquals("\t --- 5/13/2017 ---  --- -------- Appointments ------------ --- \t5/10/2017 at 1:30pm ,Appt Entry, This is an appt entry \t5/10/2017 at 8:30pm ,Appt Entry, This is an appt entry ",TEMP);
	 	}
	/*
	 *assertion for line 146
	 */
	@Test
	    public void test12()  throws Throwable  {
	        CalDay calDay0 = new CalDay();
	        int int0 = calDay0.getDay();
	        assertEquals(0, int0);
	}
	/*
	 *assertion for line 154
	 */
	@Test
	    public void test13()  throws Throwable  {
	        CalDay calDay0 = new CalDay();
	        int int0 = calDay0.getMonth();
	        assertEquals(0, int0);
	}
	/*
	 *assertion to catch removal of lines 59, 60, 61
	 */
    @Test
    	public void test14()  throws Throwable  {
      		GregorianCalendar GregorianCalendar0 = new GregorianCalendar((-2331), (-2331), (-2331), 0, 0);
      		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      		int int0 = calDay0.getDay();
      		assertEquals(13, int0);
      		assertTrue(calDay0.isValid());
      		assertEquals(4, calDay0.getMonth());
      		assertEquals(2533, calDay0.getYear());
  }
}
