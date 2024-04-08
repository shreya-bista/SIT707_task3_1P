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
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
		
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("MinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("MinJanuary1ShouldDecrementToDecember31 > " + date);
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
		System.out.println("LeapYearFebruary29_ShouldIncrementToMarch1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testLeapYearFebruary29_ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("LeapYearFebruary29_ShouldDecrementToFebruary28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMinJune1_ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("MinJune1_ShouldIncrementToJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testMinJune2_ShouldIncrementToJune3() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("MinJune2_ShouldIncrementToJune3 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}	
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("MinJune15_ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune30_ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("MinJune30_ShouldIncrementToJuly1 > " + date);
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
	    System.out.println("MinJan15_ShouldIncrementToJan16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinFeb15_ShouldIncrementToFeb16() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("MinFeb15_ShouldIncrementToFeb16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMinNov15_ShouldIncrementToNov16() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("MinNov15_ShouldIncrementToNov16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	
	@Test
	public void testMinDec15_ShouldIncrementToDec16() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("MinDec15_ShouldIncrementToDec16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("MinJune15_ShouldIncrementToJune16_1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("MinJune15_ShouldIncrementToJune16_1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("MinJune15_ShouldIncrementToJune16_2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMinJune15_ShouldIncrementToJune16_2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("MinJune15_ShouldIncrementToJune16_2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	
	

}
