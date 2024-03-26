package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {
    
    @Test
    public void testStudentIdentity() {
        String studentId = "";
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
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMinJanuary1ShouldDecrementToDecember31() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    /*
     * Write tests for rest months of year 2024.
     */

    // Test cases for March
    @Test
    public void testMaxMarch31ShouldIncrementToApril1() {
        DateUtil date = new DateUtil(31, 3, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testMaxMarch31ShouldDecrementToMarch30() {
        DateUtil date = new DateUtil(31, 3, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testNominalMarch() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
        date.increment();
        
    }
    @Test
    public void testMinMarch1ShouldDecrementToFebruary28() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testMinMarch1ShouldIncrementToMarch2() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }
    
    @Test
    public void testMaxAprilShouldIncrementToMay1() {
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testMaxAprilShouldDecrementToApril29() {
        DateUtil date = new DateUtil(30, 4, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testAprilNominal() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testMinAprilShouldIncrementToApril2() {
        DateUtil date = new DateUtil(1, 4, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testMinAprilShouldDecrementToMarch31() {
        DateUtil date = new DateUtil(1, 4, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }
    @Test
    public void testMaxMay31ShouldIncrementToJune1() {
        DateUtil date = new DateUtil(31, 5, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    @Test
    public void testMaxMay31ShouldDecrementToMay30() {
        DateUtil date = new DateUtil(31, 5, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testMayNominal() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testMinMayShouldIncrementToMay2() {
        DateUtil date = new DateUtil(1, 5, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testMinMayShouldDecrementToApril30() {
        DateUtil date = new DateUtil(1, 5, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }
    @Test
    public void testMaxJune30ShouldIncrementToJuly1() {
        DateUtil date = new DateUtil(30, 6, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }

    @Test
    public void testMaxJune30ShouldDecrementToJune29() {
        DateUtil date = new DateUtil(30, 6, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    @Test
    public void testJuneNominal() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    @Test
    public void testMinJuneShouldIncrementToJune2() {
        DateUtil date = new DateUtil(1, 6, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    @Test
    public void testMinJuneShouldDecrementToMay31() {
        DateUtil date = new DateUtil(1, 6, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
    @Test
    public void testMaxJuly31ShouldIncrementToAugust1() {
        DateUtil date = new DateUtil(31, 7, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }

    @Test
    public void testMaxJuly31ShouldDecrementToJuly30() {
        DateUtil date = new DateUtil(31, 7, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }
    public void testJulyNominal() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }

    @Test
    public void testMinJulyShouldIncrementToJuly2() {
        DateUtil date = new DateUtil(1, 7, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }

    @Test
    public void testMinJulyShouldDecrementToJune30() {
        DateUtil date = new DateUtil(1, 7, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
    @Test
    public void testMaxAugust31ShouldIncrementToSeptember1() {
        DateUtil date = new DateUtil(31, 8, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMaxAugust31ShouldDecrementToAugust30() {
        DateUtil date = new DateUtil(31, 8, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMinAugust1ShouldIncrementToAugust2() {
        DateUtil date = new DateUtil(1, 8, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMinAugust1ShouldDecrementToJuly31() {
        DateUtil date = new DateUtil(1, 8, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testNominalAugust() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    @Test
    public void testMaxSeptember30ShouldIncrementToOctober1() {
        // September max boundary area: max+1
        DateUtil date = new DateUtil(30, 9, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }
    
    @Test
    public void testMaxSeptember30ShouldDecrementToSeptember29() {
        // September max boundary area: max-1
        DateUtil date = new DateUtil(30, 9, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(9, date.getMonth());
    }
    
    @Test
    public void testMinSeptember1ShouldIncrementToSeptember2() {
        // September min boundary area: min+1
        DateUtil date = new DateUtil(1, 9, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(9, date.getMonth());
    }
    
    @Test
    public void testMinSeptember1ShouldDecrementToAugust31() {
        // September min boundary area: min-1
        DateUtil date = new DateUtil(1, 9, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }
    @Test
    public void testNominalSeptember() {
        int rand_day_1_to_30_september = 1 + new Random().nextInt(30); // September has 30 days
        DateUtil date = new DateUtil(rand_day_1_to_30_september, 9, 2024);
        System.out.println("Nominal September Test: " + date);
        date.increment();
        System.out.println(date);
    }
    @Test
    public void testMaxOctober31ShouldIncrementToNovember1() {
        // October max boundary area: max+1
        DateUtil date = new DateUtil(31, 10, 2024);
        System.out.println("october31ShouldIncrementToNovember1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }

    @Test
    public void testMaxOctober31ShouldDecrementToOctober30() {
        // October max boundary area: max-1
        DateUtil date = new DateUtil(31, 10, 2024);
        System.out.println("october31ShouldDecrementToOctober30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }

    @Test
    public void testMinOctober1ShouldIncrementToOctober2() {
        // October min boundary area: min+1
        DateUtil date = new DateUtil(1, 10, 2024);
        System.out.println("october1ShouldIncrementToOctober2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }

    @Test
    public void testMinOctober1ShouldDecrementToSeptember30() {
        // October min boundary area: min-1
        DateUtil date = new DateUtil(1, 10, 2024);
        System.out.println("october1ShouldDecrementToSeptember30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(9, date.getMonth());
    }
    public void testNominalOctober() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
        System.out.println("testNominalOctober > " + date);
        date.increment();
        System.out.println(date);
        // Assert that the month is still October and the day is one more than the random day
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay());
    }
    @Test
    public void testMaxNovember30ShouldIncrementToDecember1() {
        // November max boundary area: max+1
        DateUtil date = new DateUtil(30, 11, 2024);
        date.increment();
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testMaxNovember30ShouldDecrementToNovember29() {
        // November max boundary area: max-1
        DateUtil date = new DateUtil(30, 11, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
    
    @Test
    public void testNominalNovember() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
        date.increment();
        // Add more assertions if needed
    }
    
    @Test
    public void testMinNovember1ShouldIncrementToNovember2() {
        DateUtil date = new DateUtil(1, 11, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
    
    @Test
    public void testMinNovember1ShouldDecrementToOctober31() {
        DateUtil date = new DateUtil(1, 11, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    @Test
    public void testMaxDecember31ShouldIncrementToJanuary1() {
        // December max boundary area: max+1
        DateUtil date = new DateUtil(31, 12, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2025, date.getYear());
    }

    @Test
    public void testMaxDecember31ShouldDecrementToDecember30() {
        // December max boundary area: max-1
        DateUtil date = new DateUtil(31, 12, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMinDecember1ShouldIncrementToDecember2() {
        // December min boundary area: min+1
        DateUtil date = new DateUtil(1, 12, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMinDecember1ShouldDecrementToNovember30() {
        // December min boundary area: min-1
        DateUtil date = new DateUtil(1, 12, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testNominalDecember() {
        // Test a random day in December
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
        date.increment();
        Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    @Test
	public void testMaxFebruary28LeapYearShouldIncrementToFebruary29() {
		DateUtil date = new DateUtil(28, 2, 2024);
		date.increment();
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMaxFebruary28LeapYearShouldDecrementToFebruary27() {
		DateUtil date = new DateUtil(28, 2, 2024);
		date.decrement();
		Assert.assertEquals(27, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
	@Test
    public void testMaxFebruary28NonLeapYearShouldIncrementToMarch1() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testMaxFebruary28NonLeapYearShouldDecrementToFebruary27() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.decrement();
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
	
	@Test
	public void testNominalFebruaryLeapYear() {
		DateUtil date = new DateUtil(15, 2, 2024);
		date.increment();
	}
	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		DateUtil date = new DateUtil(1, 2, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		DateUtil date = new DateUtil(1, 2, 2024);
		date.decrement();
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

    
    
    
}
