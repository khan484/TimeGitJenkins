package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
	void getTotalSeconds(String candidate) {
	int seconds = Time.getTotalSeconds(candidate);
	assertTrue("The seconds were not calculated properly", seconds ==0);

	}
	
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
	void getTotalMinutes(String candidate) {
	int minutes = Time.getTotalMinutes(candidate);
	assertTrue("The minutes were not calculated properly", minutes ==0);

	}
	
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
	void getTotalHours(String candidate) {
	int hours = Time.getTotalHours(candidate);
	assertTrue("The hours were not calculated properly", hours ==5);

	}

	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59", "05:15:15:15" })
	void getMilliSeconds(String candidate) {
	int milliseconds = Time.getMilliSeconds(candidate);
	assertTrue("The milliseconds were not calculated properly", milliseconds ==5);

	}
	
	@Test
	public void testGetMilliSecondsGood() 
	{
		int milliseconds = Time.getMilliSeconds("05:05:05:05");
		assertTrue("The milli seconds were not calculated properly", milliseconds==18305);
	}
	
	@Test
	public void testGetMilliSecondsBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getMilliSeconds("10:00");});
	}
	
	@Test
	public void testGetTotalSecondsGood() 
	{
		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds==18305);
	}
	
	@Test
	public void testGetTotalMinutesGood() 
	{
		int minutes = Time.getTotalMinutes("05:05:05");
		assertTrue("The seconds were not calculated properly", minutes==05);
	}
	
	@Test
	public void testGetTotalHoursGood() 
	{
		int hours = Time.getTotalHours("05:05:05");
		assertTrue("The seconds were not calculated properly", hours==05);
	}
	
	@Test
	public void testGetTotalSecondsBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalSeconds("10:00");});
	}
	
	@Test
	public void testGetTotalMinutesBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalMinutes("10");});
	}
	
	@Test
	public void testGetTotalHoursBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalMinutes("");});
	}


	@Test
	void testGetTotalSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSeconds() {
		int hours = Time.getTotalHours("05:05:05");
	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}

}
