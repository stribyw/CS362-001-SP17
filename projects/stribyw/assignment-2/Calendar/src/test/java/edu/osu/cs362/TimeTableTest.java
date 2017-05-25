package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {
	/*
	 *test: making 4 appointments, creating linked list & adding appointments to it
	 *out of order, creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list. All appt are valid.
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
		 appt.setStartDay(1);
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
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt3.setStartHour(10);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMinute(30);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartDay(4);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMonth(7);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartYear(01);
		 assertEquals(true, appt3.getValid());
		 appt3.setTitle("4th of July Party");
		 assertEquals("4th of July Party", appt3.getTitle());
		 appt3.setDescription("This is my 4th of July party.");
		 assertEquals("This is my 4th of July party.", appt3.getDescription());
		 Appt appt4 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt4.setStartHour(10);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMinute(30);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartDay(25);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMonth(12);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartYear(01);
		 assertEquals(true, appt4.getValid());
		 appt4.setTitle("Christmas Party");
		 assertEquals("Christmas Party", appt4.getTitle());
		 appt4.setDescription("This is my Christmas party.");
		 assertEquals("This is my Christmas party.", appt4.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt3);
	  	 appts.add(appt2);
	  	 appts.add(appt);
	  	 appts.add(appt4);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 //appts = null;
	 	 //appt = null;
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
	 @Test
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
		 appt.setStartDay(1);
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
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt3.setStartHour(10);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMinute(30);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartDay(2);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMonth(5);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartYear(17);
		 assertEquals(true, appt3.getValid());
		 appt3.setTitle("May Second");
		 assertEquals("May Second", appt3.getTitle());
		 appt3.setDescription("This is my May Second party.");
		 assertEquals("This is my May Second party.", appt3.getDescription());
		 Appt appt4 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt4.setStartHour(10);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMinute(30);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartDay(1);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMonth(5);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartYear(17);
		 assertEquals(true, appt4.getValid());
		 appt4.setTitle("May First");
		 assertEquals("May First", appt4.getTitle());
		 appt4.setDescription("This is my May First party.");
		 assertEquals("This is my May First party.", appt4.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 appts.add(appt2);
	  	 appts.add(appt3);
	  	 appts.add(appt4);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 appts.remove(appt);
	 	 appts.remove(appt2);
	 	 appts.remove(appt3);
	 	 appts.remove(appt4);	 	 
	 	 appt = null;
	 	 //appts = null;
	 	 timetable.deleteAppt(appts, appt);
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 	 timetable.deleteAppt(appts, appt4);
	 }
	/*
	 *test: making 1 appointment1, creating linked list & adding invalid appointments to it,
	 *creating to GregorianCalendars with one before the other in getApptRange,
	 *and deleting appointments from linked list.
	 */
	 @Test
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
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 //both line 124, only appt & appts = null line 124, but lines 126 & 127 not hit
	 	 //with neither lines, lines 126 & 127 hit
	 	 //appts = null;
	 	 // appt = null;
	 	 timetable.deleteAppt(appts, appt);
	 }
	/*
	 * 
	 */
	 @Test
	  public void test04()  throws Throwable  {
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
		 appt.setStartDay(1);
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
		 Appt appt3 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt3.setStartHour(10);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMinute(30);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartDay(2);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartMonth(5);
		 assertEquals(true, appt3.getValid());
		 appt3.setStartYear(17);
		 assertEquals(true, appt3.getValid());
		 appt3.setTitle("May Second");
		 assertEquals("May Second", appt3.getTitle());
		 appt3.setDescription("This is my May Second party.");
		 assertEquals("This is my May Second party.", appt3.getDescription());
		 Appt appt4 = new Appt(startHour, 
	 		startMinute,
	 		startDay,
	 		startMonth,
	 		startYear,
	 		title,
	 		description);
	  	 appt4.setStartHour(10);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMinute(30);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartDay(1);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartMonth(5);
		 assertEquals(true, appt4.getValid());
		 appt4.setStartYear(17);
		 assertEquals(true, appt4.getValid());
		 appt4.setTitle("May First");
		 assertEquals("May First", appt4.getTitle());
		 appt4.setDescription("This is my May First party.");
		 assertEquals("This is my May First party.", appt4.getDescription());
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts.add(appt);
	  	 appts.add(appt2);
	  	 appts.add(appt3);
	  	 appts.add(appt4);
	  	 LinkedList<CalDay> caldays = new LinkedList<CalDay>();
		 GregorianCalendar gregcal = new GregorianCalendar();
	 	 GregorianCalendar gregcal2 = new GregorianCalendar();
	 	 gregcal2.add((GregorianCalendar.MONTH), 2);
	 	 TimeTable timetable = new TimeTable();
	 	 caldays = timetable.getApptRange(appts, gregcal, gregcal2);
	 	 appts.remove(appt);
	 	 appts.remove(appt2);
	 	 appts.remove(appt3);
	 	 appts.remove(appt4);	 	 
	 	 //appt = null;
	 	 appts = null;
	 	 timetable.deleteAppt(appts, appt);
	 	 timetable.deleteAppt(appts, appt2);
	 	 timetable.deleteAppt(appts, appt3);
	 	 timetable.deleteAppt(appts, appt4);
	 }
}
