package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import edu.osu.cs362.TimeTable;
import java.util.Locale;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class TimeTableTest {
	/*
	 *test: making 4 appointments, creating linked list & adding appointments to it
	 *out of order, creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list. All appt are valid.
	 */
	 @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	  	 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	  	 Appt appt = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	 	 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(3);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(11);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("New Years Party");
		 assertEquals("New Years Party", appt.getTitle());
		 appt.setDescription("This is my New Years party.");
		 assertEquals("This is my New Years party.", appt.getDescription());    
	  	 Appt appt2 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(05);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("Halloween Party");
		 assertEquals("Halloween Party", appt.getTitle());
		 appt.setDescription("This is my Halloween party.");
		 assertEquals("This is my Halloween party.", appt.getDescription());
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(4);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(7);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("4th of July Party");
		 assertEquals("4th of July Party", appt.getTitle());
		 appt.setDescription("This is my 4th of July party.");
		 assertEquals("This is my 4th of July party.", appt.getDescription());
		 Appt appt4 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(25);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(12);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("Christmas Party");
		 assertEquals("Christmas Party", appt.getTitle());
		 appt.setDescription("This is my Christmas party.");
		 assertEquals("This is my Christmas party.", appt.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt3);
	  	 appts.add(appt2);
	  	 appts.add(appt);
	  	 appts.add(appt4);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
         gregcal.set(GregorianCalendar.YEAR, 2017);
         gregcal.set(GregorianCalendar.MONTH, 5);
         gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.set(GregorianCalendar.YEAR, 2017);
         gregcal2.set(GregorianCalendar.MONTH, 5);
         gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 21);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 assertNotNull(caldays);
	 	 assertEquals(4, appts.size());
	 	 timetable.deleteAppt(appts, appt4);
	 	 timetable.deleteAppt(appts, appt);
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 }
	/*
	 *test: making 4 appointments, creating linked list & adding appointments to it
	 *in order, creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list. Two appointments are within the 
	 *Gregorian Calendar date range. All appt are valid.
	 */
	 @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	  	 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	  	 Appt appt = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	 	 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(03);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(11);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("New Years Party");
		 assertEquals("New Years Party", appt.getTitle());
		 appt.setDescription("This is my New Years party.");
		 assertEquals("This is my New Years party.", appt.getDescription());    
	  	 Appt appt2 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(31);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("Halloween Party");
		 assertEquals("Halloween Party", appt.getTitle());
		 appt.setDescription("This is my Halloween party.");
		 assertEquals("This is my Halloween party.", appt.getDescription());
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(2);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(5);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("May Second");
		 assertEquals("May Second", appt.getTitle());
		 appt.setDescription("This is my May Second party.");
		 assertEquals("This is my May Second party.", appt.getDescription());
		 Appt appt4 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(5);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(17);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("May First");
		 assertEquals("May First", appt.getTitle());
		 appt.setDescription("This is my May First party.");
		 assertEquals("This is my May First party.", appt.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 appts.add(appt2);
	  	 appts.add(appt3);
	  	 appts.add(appt4);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
         gregcal.set(GregorianCalendar.YEAR, 2017);
         gregcal.set(GregorianCalendar.MONTH, 5);
         gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.set(GregorianCalendar.YEAR, 2017);
         gregcal2.set(GregorianCalendar.MONTH, 5);
         gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 21);
	 	 //gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 assertNotNull(caldays);
	 	 assertEquals(4, appts.size());
	 	 appts.remove(appt);
	 	 appts.remove(appt2);
	 	 appts.remove(appt3);
	 	 appts.remove(appt4);
	 	 timetable.deleteAppt(appts, appt);
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 	 timetable.deleteAppt(appts, appt4);
	 	 //below is attempt for null case of first if statement in deleteAppt(), does not work
	 	 timetable.deleteAppt(appts, appt2);
	 }
	/*
	 *test: making 1 appointment1, creating linked list & adding invalid appointments to it,
	 *creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list.
	 */
	 @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	  	 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	 	 Appt appt = new Appt(
	 		//valid,
	 		startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description
	 	);
	 	 appt.getValid();
	 	 appt.setStartHour(24);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(60);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(32);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(13);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(false, appt.getValid());
		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());
		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());         		
	 	 assertEquals(false, appt.getValid());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
         gregcal.set(GregorianCalendar.YEAR, 2017);
         gregcal.set(GregorianCalendar.MONTH, 5);
         gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);		 
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.set(GregorianCalendar.YEAR, 2017);
         gregcal2.set(GregorianCalendar.MONTH, 5);
         gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 21);
	 	 gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 assertNotNull(caldays);
	 	 assertEquals(1, appts.size());
	 	 timetable.deleteAppt(appts, appt);
	 }
	/*
	 *assert size of linked list after adding two appt and deleting one
	 */
	@Test(timeout = 4000)
		public void test04()  throws Throwable  {
	  		TimeTable timeTable0 = new TimeTable();
			LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	  	    Appt appt0 = new Appt(0, (-1985), 0, 5, 0, "test string", "");
	  		linkedList0.add(appt0);
	  		Appt appt1 = new Appt(5, 5, 5, 5, 5, "test string", "");
	  		linkedList0.add(appt1);
		    timeTable0.deleteAppt(linkedList0, appt1);
	  		assertEquals(1, linkedList0.size());
		}
	/*
	 *assert size of linked list after adding one appt and deleting it
	 */
	@Test(timeout = 4000)
		public void test05()  throws Throwable  {
	    	TimeTable timeTable0 = new TimeTable();
	  		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	  		Appt appt0 = new Appt(5, 5, 5, 5, 5, "test string", "");
	  		linkedList0.add(appt0);
	  		timeTable0.deleteAppt(linkedList0, appt0);
	  		assertEquals(0, linkedList0.size());
		}
	/*
	 *assert size of linked list after adding two appt and deleting one
	 */
	@Test(timeout = 4000)
		public void test06()  throws Throwable  {
	   		TimeTable timeTable0 = new TimeTable();
	  		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	  		Appt appt0 = new Appt(0, (-1985), 0, 5, 0, "test string", "");
	  		linkedList0.add(appt0);
	  		Appt appt1 = new Appt(5, 5, 5, 5, 5, "test string", "");
	  		timeTable0.deleteAppt(linkedList0, appt1);
	  		assertEquals(1, linkedList0.size());
		}
	/*
	 *assert a linked list is null after making two and deleting one 
	 */
	@Test(timeout = 4000)
	    public void test07()  throws Throwable  {
	    	TimeTable timeTable0 = new TimeTable();
	    	GregorianCalendar GregorianCalendar0 = new GregorianCalendar((-4641), (-4641), (-4641), (-4641), (-4641), (-4641));
	  		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
	  		LinkedList<Appt> linkedList0 = calDay0.appts;
	  		LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
	  		assertNull(linkedList1);
		}
	/*
	 *assert linked list is null after making and deleting it
	 */
	@Test(timeout = 4000)
	    public void test08()  throws Throwable  {
	  		TimeTable timeTable0 = new TimeTable();
	  		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	  		Appt appt0 = new Appt(0, (-1985), 0, 5, 0, "test string", "");
	  		LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
	  		assertNull(linkedList1);
		}
	/*
	 *assert linked list null after deletion
	 */
	@Test(timeout = 4000)
		public void test09()  throws Throwable  {
	  		Appt appt0 = new Appt(59, 59, 59, 59, 59, "test string", "test string");
	  		TimeTable timeTable0 = new TimeTable();
	  		LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
	  		assertNull(linkedList0);
		}
	/*
	 *test: making 4 appointments, creating linked list & adding appointments to it
	 *out of order, creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list. All appt are valid.
	 */
	 @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	  	 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	  	 Appt appt = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	 	 appt.setStartHour(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(01);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(03);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(11);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("New Years Party");
		 assertEquals("New Years Party", appt.getTitle());
		 appt.setDescription("This is my New Years party.");
		 assertEquals("This is my New Years party.", appt.getDescription());    
	  	 Appt appt2 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(05);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(04);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("Halloween Party");
		 assertEquals("Halloween Party", appt.getTitle());
		 appt.setDescription("This is my Halloween party.");
		 assertEquals("This is my Halloween party.", appt.getDescription());
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt.setStartHour(10);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(30);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(4);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(7);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(01);
		 assertEquals(true, appt.getValid());
		 appt.setTitle("4th of July Party");
		 assertEquals("4th of July Party", appt.getTitle());
		 appt.setDescription("This is my 4th of July party.");
		 assertEquals("This is my 4th of July party.", appt.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 appts.add(appt2);
	  	 //appts.add(appt3);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
         gregcal.set(GregorianCalendar.YEAR, 2017);
         gregcal.set(GregorianCalendar.MONTH, 5);
         gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.set(GregorianCalendar.YEAR, 2017);
         gregcal2.set(GregorianCalendar.MONTH, 5);
         gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 21);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 assertNotNull(caldays);
	 	 assertEquals(2, appts.size());		//was 3
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 	 timetable.deleteAppt(appts, appt);
	 	 assertEquals(0, appts.size());
	 }
	 	/*
	 *test: making 4 appointments, creating linked list & adding appointments to it
	 *out of order, creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list. All appt are valid.
	 */
	 @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	  	 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	  	 Appt appt = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);   
	  	 Appt appt2 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 appts.add(appt2);
	  	 appts.add(appt3);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
         gregcal.set(GregorianCalendar.YEAR, 2017);
         gregcal.set(GregorianCalendar.MONTH, 5);
         gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.set(GregorianCalendar.YEAR, 2017);
         gregcal2.set(GregorianCalendar.MONTH, 5);
         gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 21);
	 	 TimeTable timetable = new TimeTable();
	 	 try {
	 	 	LinkedList<CalDay> calDays = timetable.getApptRange(appts,gregcal2,gregcal);
         } catch (IllegalArgumentException i) {
       	    assertNotNull(i);
 		 Appt appt4 = new Appt(startHour,
	 	             startMinute ,
	                 startDay ,
	                 startMonth ,
	                 startYear ,
	                 title,
	                 description);
		 appts.add(appt4);
		 LinkedList<CalDay> calDay2 = timetable.getApptRange(appts,gregcal,gregcal2);
		 assertNotNull(calDay2);
		 }
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 assertNotNull(caldays);
	 	 assertEquals(4, appts.size());
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 	 timetable.deleteAppt(appts, appt);
	 	 assertEquals(1, appts.size());
	}
	@Test(timeout = 4000)
	    public void test12()  throws Throwable  {
			int startHour=13;
            int startMinute=30;
            int startDay=5;
            int startMonth=9;
            int startYear=2017;
            String title="test";
            String description="This is a test";
            Appt appt = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			startHour=2;
            startDay=-2;
            Appt appt2 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			startHour=-6;
            startDay=-5;
            Appt appt3 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			LinkedList<Appt> appts = new LinkedList<Appt>();
			appts.add(appt);
			appts.add(appt2);
			appts.add(appt3);
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2017);
            gregcal.set(GregorianCalendar.MONTH, 5);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 13);
			GregorianCalendar gregcal2 = new GregorianCalendar();
            gregcal2.set(GregorianCalendar.YEAR, 2017);
            gregcal2.set(GregorianCalendar.MONTH, 5);
            gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 16);
			TimeTable timetable = new TimeTable();
            LinkedList<CalDay> calDays = timetable.getApptRange(appts,gregcal,gregcal2);
			assertNotNull(calDays);
	}
	@Test(timeout = 4000)
	 public void test13  ()	throws Throwable {
		int startHour=13;
        int startMinute=30;
        int startDay=5;
        int startMonth=4;
        int startYear=2016;
        String title="test";
        String description="This is a test";
        Appt appt1 = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);
        startHour=1;
        startDay=3;
        Appt appt2 = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);
        startHour=5;
        startDay=4;
        Appt appt3 = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);
        LinkedList<Appt> appts = new LinkedList<Appt>();
        appts.add(appt1);
        appts.add(appt2);
        appts.add(appt3);
        GregorianCalendar gregcal = new GregorianCalendar();
        gregcal.set(GregorianCalendar.YEAR, 2016);
        gregcal.set(GregorianCalendar.MONTH, 4);
        gregcal.set(GregorianCalendar.DAY_OF_MONTH, 3);
        GregorianCalendar gregcal2 = new GregorianCalendar();
        gregcal2.set(GregorianCalendar.YEAR, 2016);
        gregcal2.set(GregorianCalendar.MONTH, 4);
        gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 6);
        TimeTable timetable = new TimeTable();
        appts =  timetable.deleteAppt(appts,appt3);
		assertEquals(2,appts.size());
	}
	@Test(timeout = 4000)
        public void test14()  throws Throwable  {
            LinkedList<Appt> appts = new LinkedList<Appt>();
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2016);
            gregcal.set(GregorianCalendar.MONTH, 4);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 3);
            GregorianCalendar gregcal2 = new GregorianCalendar();
            gregcal2.set(GregorianCalendar.YEAR, 2016);
            gregcal2.set(GregorianCalendar.MONTH, 4);
            gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 6);
            TimeTable timetable = new TimeTable();
            LinkedList<CalDay> calDays = timetable.getApptRange(appts,gregcal,gregcal2);
			assertNotNull(calDays);
			int startHour=4;
            int startMinute=30;
            int startDay=5;
            int startMonth=4;
            int startYear=2016;
            String title="test6";
            String description="This is a test";
            Appt appt1 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			timetable.deleteAppt(appts,appt1);
            assertNotNull(calDays);
    }
	@Test
	    public void test15()  throws Throwable  {
			int startHour=13;
            int startMinute=30;
            int startDay=5;
            int startMonth=4;
            int startYear=2016;
            String title="day";
            String description="This is a day";
            Appt appt1 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			startHour=1;
            startDay=3;
            Appt appt2 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			startHour=-5;
            startDay=4;
            Appt appt3 = new Appt(startHour,
                     startMinute ,
                     startDay ,
                     startMonth ,
                     startYear ,
                     title,
                     description);
			LinkedList<Appt> appts = new LinkedList<Appt>();
			appts.add(appt1);
			appts.add(appt2);
			appts.add(appt3);
            GregorianCalendar gregcal = new GregorianCalendar();
            gregcal.set(GregorianCalendar.YEAR, 2016);
            gregcal.set(GregorianCalendar.MONTH, 4);
            gregcal.set(GregorianCalendar.DAY_OF_MONTH, 3);
			GregorianCalendar gregcal2 = new GregorianCalendar();
            gregcal2.set(GregorianCalendar.YEAR, 2016);
            gregcal2.set(GregorianCalendar.MONTH, 4);
            gregcal2.set(GregorianCalendar.DAY_OF_MONTH, 6);
			TimeTable timetable = new TimeTable();
            LinkedList<CalDay> calDays = timetable.getApptRange(appts,gregcal,gregcal2);
			assertNotNull(calDays);
	}
}
