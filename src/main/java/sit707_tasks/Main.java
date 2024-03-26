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
         * January nominal somewhere between min and max
         */
        System.out.println("January random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min: increment should be 2nd January.");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min: decrement should be 31 December previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);    
        
        /*
    	 * February max boundary area: max-1, max+1
    	 */
        System.out.println("February max: increment should go to March.");
        date = new DateUtil(28, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("February max: decrement should be 27 February.");
        date = new DateUtil(28, 2, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);

        
        /*
         * February nominal (somewhere between min and max)
         */
        System.out.println("February random day between (1, 28/29): increment should be 1 day next.");
        int rand_day_1_to_28_29 = 1 + new Random().nextInt(28); // considering non-leap year
        date = new DateUtil(rand_day_1_to_28_29, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * February min boundary area: min+1, min-1
         */
        System.out.println("February min: increment should be 2nd February.");
        date = new DateUtil(1, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("February min: decrement should be 31 January.");
        date = new DateUtil(1, 2, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 *  March max boundary area: max-1, max+1
    	 */
        System.out.println("March max: increment should go to April.");
        date = new DateUtil(31, 3, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("March max: decrement should be 30 March.");
        date = new DateUtil(31, 3, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         *  March nominal (somewhere between min and max)
         */
        System.out.println("March random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_march = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_march, 3, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * March  min boundary area: min+1, min-1
         */
        System.out.println("March min: increment should be 2nd March.");
        date = new DateUtil(1, 3, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("March min: decrement should be 28/29 February.");
        date = new DateUtil(1, 3, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        
        
        /*
    	 * April max boundary area: max-1, max+1
    	 */
        System.out.println("April max: increment should go to May.");
        date = new DateUtil(30, 4, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("April max: decrement should be 29 April.");
        date = new DateUtil(30, 4, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         * April nominal (somewhere between min and max)
         */
        System.out.println("April random day between (1, 30): increment should be 1 day next.");
        int rand_day_1_to_30_april = 1 + new Random().nextInt(30);
        date = new DateUtil(rand_day_1_to_30_april, 4, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * April min boundary area: min+1, min-1
         */
        System.out.println("April min: increment should be 2nd April.");
        date = new DateUtil(1, 4, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("April min: decrement should be 31 March.");
        date = new DateUtil(1, 4, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 * May max boundary area: max-1, max+1
    	 */
        System.out.println("May max: increment should go to June.");
        date = new DateUtil(31, 5, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("May max: decrement should be 30 May.");
        date = new DateUtil(31, 5, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * May nominal (somewhere between min and max)
         */
        System.out.println("May random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_may = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_may, 5, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         * May min boundary area: min+1, min-1
         */
        System.out.println("May min: increment should be 2nd May.");
        date = new DateUtil(1, 5, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("May min: decrement should be 30 April.");
        date = new DateUtil(1, 5, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 * June max boundary area: max-1, max+1
    	 */
        System.out.println("June max: increment should go to July.");
        date = new DateUtil(30, 6, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("June max: decrement should be 29 June.");
        date = new DateUtil(30, 6, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         * June nominal (somewhere between min and max)
         */
        System.out.println("June random day between (1, 30): increment should be 1 day next.");
        int rand_day_1_to_30_june = 1 + new Random().nextInt(30);
        date = new DateUtil(rand_day_1_to_30_june, 6, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         *June  min boundary area: min+1, min-1
         */
        System.out.println("June min: increment should be 2nd June.");
        date = new DateUtil(1, 6, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("June min: decrement should be 31 May.");
        date = new DateUtil(1, 6, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 *July  max boundary area: max-1, max+1
    	 */
        System.out.println("July max: increment should go to August.");
        date = new DateUtil(31, 7, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("July max: decrement should be 30 July.");
        date = new DateUtil(31, 7, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         *July  nominal (somewhere between min and max)
         */
        System.out.println("July random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_july = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_july, 7, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         *July  min boundary area: min+1, min-1
         */
        System.out.println("July min: increment should be 2nd July.");
        date = new DateUtil(1, 7, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("July min: decrement should be 30 June.");
        date = new DateUtil(1, 7, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 *August  max boundary area: max-1, max+1
    	 */
        System.out.println("August max: increment should go to September.");
        date = new DateUtil(31, 8, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("August max: decrement should be 30 August.");
        date = new DateUtil(31, 8, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         * August nominal (somewhere between min and max)
         */
        System.out.println("August random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_august = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_august, 8, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         * August min boundary area: min+1, min-1
         */
        System.out.println("August min: increment should be 2nd August.");
        date = new DateUtil(1, 8, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("August min: decrement should be 31 July.");
        date = new DateUtil(1, 8, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 *September  max boundary area: max-1, max+1
    	 */
        System.out.println("September max: increment should go to October.");
        date = new DateUtil(30, 9, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("September max: decrement should be 29 September.");
        date = new DateUtil(30, 9, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
      
        /*
         * September nominal (somewhere between min and max)
         */
        System.out.println("September random day between (1, 30): increment should be 1 day next.");
        int rand_day_1_to_30_september = 1 + new Random().nextInt(30);
        date = new DateUtil(rand_day_1_to_30_september, 9, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         *September  min boundary area: min+1, min-1
         */
        System.out.println("September min: increment should be 2nd September.");
        date = new DateUtil(1, 9, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("September min: decrement should be 31 August.");
        date = new DateUtil(1, 9, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        
        /*
    	 *October  max boundary area: max-1, max+1
    	 */
        System.out.println("October max: increment should go to November.");
        date = new DateUtil(31, 10, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("October max: decrement should be 30 October.");
        date = new DateUtil(31, 10, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         * October nominal (somewhere between min and max)
         */
        System.out.println("October random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_october = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_october, 10, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         * October min boundary area: min+1, min-1
         */
        System.out.println("October min: increment should be 2nd October.");
        date = new DateUtil(1, 10, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("October min: decrement should be 30 September.");
        date = new DateUtil(1, 10, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
    	 * November max boundary area: max-1, max+1
    	 */
        System.out.println("November max: increment should go to December.");
        date = new DateUtil(30, 11, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("November max: decrement should be 29 November.");
        date = new DateUtil(30, 11, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         *November  nominal (somewhere between min and max)
         */
        System.out.println("November random day between (1, 30): increment should be 1 day next.");
        int rand_day_1_to_30_november = 1 + new Random().nextInt(30);
        date = new DateUtil(rand_day_1_to_30_november, 11, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
       
        
        /*
         * November min boundary area: min+1, min-1
         */
        System.out.println("November min: increment should be 2nd November.");
        date = new DateUtil(1, 11, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("November min: decrement should be 31 October.");
        date = new DateUtil(1, 11, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        
        /*
    	 *December  max boundary area: max-1, max+1
    	 */
        System.out.println("December max: increment should go to January next year.");
        date = new DateUtil(31, 12, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("December max: decrement should be 30 December.");
        date = new DateUtil(31, 12, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
    	
        
        /*
         *December  nominal (somewhere between min and max)
         */
        System.out.println("December random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31_december = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31_december, 12, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

       
        
        /*
         *December  min boundary area: min+1, min-1
         */
        System.out.println("December min: increment should be 2nd December.");
        date = new DateUtil(1, 12, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        System.out.println("December min: decrement should be 30 November.");
        date = new DateUtil(1, 12, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * -------Additional Test Cases-------
         */
     
        /*
         * Leap Year February Test
         */
        System.out.println("Leap Year February Test: 28th Feb 2024");
        date = new DateUtil(28, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);

        /*
         * Non-Leap Year February Test
         */
        System.out.println("Non-Leap Year February Test: 28th Feb 2023");
        date = new DateUtil(28, 2, 2023);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
    }
}
