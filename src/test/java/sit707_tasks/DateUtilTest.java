package sit707_tasks;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;


public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "224114235";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreya Bista";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("January 31 should increment to february 1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("January 31 should decrement to january 30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testing January Nominal > " + date);
        date.increment();
        System.out.println(date);
	}
		
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("January 1 Should Increment To January2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("Min January 1Should Decrement To December31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	//February test cases with leap year Conditions
	@Test
	public void testLeapYearFebruary29_ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("Leap year feb 29 should increment to march 1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testLeapYearFebruary29_ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("Leap year February29 should decrement To February 28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
	@Test
	public void testLeapYearMarch1_ShouldDecrementToFebruary29() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("Leap Year March 1 Should Decrement To February 29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	@Test
	public void testNotLeapYearMarch1_ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(1, 3, 2023);
		System.out.println("Not Leap Year March 1 should decrement To February 28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void testMinJune1_ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("June 1 should increment to june 2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testMinJune2_ShouldIncrementToJune3() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("June 2 should increment to june 3 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}	
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("June 15 should increment to june 16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune30_ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("June 30 should increment to July 1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}
	
	@Test
	public void testMinJune31_ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("MinJune31_ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}
	
	@Test
	public void testMinJan15_ShouldIncrementToJan16() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Jan 15 should increment to jan 16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinFeb15_ShouldIncrementToFeb16() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Feb 15 should increment to Feb 16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMinNov15_ShouldIncrementToNov16() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Nov 15 should increment to nov 16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	
	@Test
	public void testMinDec15_ShouldIncrementToDec16() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Dec 15 should increment to Dec 16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("June 15 should increment to june16_1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("June 15 should increment to June16_1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("June 15 should increment to june16_2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("June 15 should increment To june16_2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMaxJanuary1_2024_ShouldDecrementToDec31_2023() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january 1 2024 should decrement to december 31 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	

}
