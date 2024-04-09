package sit707_tasks;
import java.util.Random;


public class Main 
{
    public static void main( String[] args )
    {   
    	/*
    	 * January max boundary area: max-1, max+1
    	 */
    	System.out.println("January max: increment should go to February.");
    	DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January max: decrement should be 30 January.");
    	date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * January nominal (somewhere between min and max)
         */
        System.out.println("January random day between 1 to 31 increment should be 1 day next.");
        int randm_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(randm_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min increment should be 2 January");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min decrement should be 31 December previous year");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date); 
        
        System.out.println("February Leap year increment should be March 1");
    	date = new DateUtil(29, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("February Leap year decrement should be February 28");
        date = new DateUtil(29, 2, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);  

        System.out.println("March 1 Lear year decrement should be February 29");
        date = new DateUtil(1, 3, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);   
	}
        System.out.println("Not leap year March 1 decrement should be February 28");
        date = new DateUtil(1, 3, 2023);
        System.out.println(date);
        date.decrement();
        System.out.println(date);  
        
        System.out.println("June increment should be June 2");
    	date = new DateUtil(1, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 3");
    	date = new DateUtil(2, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 16");
    	date = new DateUtil(15, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be July 1");
    	date = new DateUtil(30, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be July 1");
    	date = new DateUtil(31, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
     
        System.out.println("Jan increment should be Jan 16");
    	date = new DateUtil(15, 1, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Feb increment should be Feb 16");
    	date = new DateUtil(15, 2, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Nov increment should be Nov 16");
    	date = new DateUtil(15, 11, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Dec increment should be Dec 16");
    	date = new DateUtil(15, 12, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 16,1700");
    	date = new DateUtil(15, 6, 1700);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 16 1701");
     	date = new DateUtil(15, 6, 1701);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 16 2023");
     	date = new DateUtil(15, 6, 2023);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June increment should be June 16 2024");
     	date = new DateUtil(15, 6, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
	}
	    System.out.println("january decrement should be december 31 2023");
     	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
     
    }
}
