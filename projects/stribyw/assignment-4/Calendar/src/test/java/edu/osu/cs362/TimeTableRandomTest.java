package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import java.util.LinkedList;



/**
 * Random Test Generator  for TimeTable class.
 */
public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; 	/* Timeout at 120 seconds */

	/**
	 * Generate Random Tests that tests TimeTable Class.
	 */
	@Test
	public void radnomtest() throws Throwable {
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
			for (int i = 0; i < 500; i++) {
				TimeTable timetable = new TimeTable();
				LinkedList<Appt> appts = new LinkedList<Appt>();

				Appt appt = new Appt(
						startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description
				);
				int newHour = (int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
				appt.setStartHour(newHour);
				int newMinute = (int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
				appt.setStartMinute(newMinute);
				int newDay = (int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
				appt.setStartDay(newDay);
				int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
				appt.setStartMonth(newMonth);
				int newYear = (int) ValuesGenerator.getRandomIntBetween(random, 1983, 2017);
				appt.setStartYear(newYear);

				Appt appt3 = new Appt(
						startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description
				);
				int newHour2 = (int) ValuesGenerator.getRandomIntBetween(random, -24, -1);
				appt3.setStartHour(newHour2);
				int newMinute2 = (int) ValuesGenerator.getRandomIntBetween(random, -61, -1);
				appt3.setStartMinute(newMinute2);
				int newDay2 = (int) ValuesGenerator.getRandomIntBetween(random, -31, 0);
				appt3.setStartDay(newDay2);
				int newMonth2 = (int) ValuesGenerator.getRandomIntBetween(random, -12, 0);
				appt3.setStartMonth(newMonth2);
				int newYear2 = (int) ValuesGenerator.getRandomIntBetween(random, 2067, 2099);
				appt3.setStartYear(newYear2);

				Appt appt1 = new Appt(
						startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description
				);
				newHour2 = (int) ValuesGenerator.getRandomIntBetween(random, 24, 48);
				appt1.setStartHour(newHour2);
				newMinute2 = (int) ValuesGenerator.getRandomIntBetween(random, 60, 120);
				appt1.setStartMinute(newMinute2);
				newDay2 = (int) ValuesGenerator.getRandomIntBetween(random, 32, 62);
				appt1.setStartDay(newDay2);
				newMonth2 = (int) ValuesGenerator.getRandomIntBetween(random, 13, 26);
				appt1.setStartMonth(newMonth2);
				newYear2 = (int) ValuesGenerator.getRandomIntBetween(random, 2018, 2032);
				appt1.setStartYear(newYear2);
					int apptDelete = ValuesGenerator.getRandomIntBetween(random, 1, 4);
					if (apptDelete == 1) {
						appts.add(appt);
						appts.remove(appt);
						appt = null;
						timetable.deleteAppt(appts, appt);
					} else if (apptDelete == 2) {
						appts.add(appt);
						appts.remove(appt);
						appts = null;
						timetable.deleteAppt(appts, appt);
					} else if (apptDelete == 3) {
						appts.add(appt);
						timetable.deleteAppt(appts, appt);
					} else if (apptDelete == 4){
					    appts.add(appt1);
						appts.add(appt3);
						timetable.deleteAppt(appts, appt1);
						timetable.deleteAppt(appts, appt3);
						timetable.deleteAppt(appts, appt);
					}
			}
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0)
				System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		}
		System.out.println("Done testing...");
	}	//comment above
}
