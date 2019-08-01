

package devicemessedup;

/*
imports for packages required for Class DeviceMessedUp
*/
import java.util.GregorianCalendar; 

//Class DeviceMessedUp
public class DeviceMessedup 
{

    /*
    The main static method for Class DeviceMessedUp
    calling required methods 
    */
    public static void main(String[] args) 
    {
        
        //calling methods to display proper messages to the user
        
        displayCurrentDate();
        displayGreetingMessage(); 
        displayTime(); 
        displayRemainingDays();
    } 
 
 
    /*
     static method displaying the current date to the user  
    */
    public static void displayCurrentDate() 
    {
        //Calender instantiation for getting Current Date
        GregorianCalendar calenderCurrentDate = new GregorianCalendar();
        
        //integer variables declarations for day,month and year
        int intMonth = calenderCurrentDate.get(java.util.Calendar.MONTH);
        int intYear  = calenderCurrentDate.get(java.util.Calendar.YEAR);
        int intDay   = calenderCurrentDate.get(java.util.Calendar.DAY_OF_MONTH);
        
        //Switch casing checking which  month was retured
        switch (intMonth)
        {
            case 0:  System.out.print ("January");
            break ;
            
            case 1:  System.out.print ("February");
            break;
            
            case 2:  System.out.print ("March");
            break;
      
            case 3:  System.out.print ("April");
            break;
            
            case 4:  System.out.print ("May");
            break;
            
            case 5:  System.out.print ("June"); 
            break;
                
            case 6:  System.out.print ("July");
            break; 
            
            case 7:  System.out.print ("August");   
            break;
            
            case 8:  System.out.print ("September"); 
            break;  
            
            case 9:  System.out.print ("October");
            break;
                
            case 10: System.out.print ("November");
            break;
                
            case 11: System.out.print ("December"); 
            break;
                
        }
    
        //displaying the CurrentDate
        System.out.print(intDay + " " + intYear +  "\n\n");
    }     
 
 
    /*
     static method displaying greeting message to the user after determining 
     is it evening or afternoon
    */
    public static void displayGreetingMessage() 
    {
            //static variables declarations
            final int HOURS_TO_AFTERNOON = 12; 
            final int HOURS_TO_EVENING = 17;
            
            //Calender instantiation for getting Current hour
            GregorianCalendar  calendarHour = new GregorianCalendar();
            
            //integer variables declaration
            int intHour = calendarHour.get(java.util.Calendar.HOUR_OF_DAY);
            
            //if conditional to check hours to afternoon or evening
            //In case of Good Morning 
            if (intHour < HOURS_TO_AFTERNOON)
            
            {
                System.out.println("Good Morning  \n");
            
            }
            //In case of Good afternoon
            else if (intHour < HOURS_TO_EVENING)
            {
                System.out.println("Good Afternoon \n ");
            }
            
            //In case of Good evening
            else {System.out.println("Good Evening \n");
            }
            
            
    }
  
    /*
    static method to display current hour and minutes according to 12 formate
    */
    public static void displayTime () 
    {
            //static variables declarations
            final int PAST_AFTERNOON_HOURS = 12; 
            
            //Calender instantiation for getting Current minutes
            GregorianCalendar  calendarMinute = new GregorianCalendar();
            
            //integer variables declarations for minutes and hour
            int intMinute = calendarMinute.get(java.util.Calendar.MINUTE); 
            int intHour = calendarMinute.get(java.util.Calendar.HOUR_OF_DAY);  
            
            //display to the user
            System.out.print("It's ");
            
            //conditional if to check is it not exactly zero minutes and displaying the current hour accordingly
            if (intMinute != 0 )
            {
                System.out.print( " " + intMinute + " ");
                System.out.print((intMinute != 1)? "minutes" : intMinute);
                System.out.print (" past ");
            
            }
            
            System.out.print((intHour > PAST_AFTERNOON_HOURS)? (intHour - PAST_AFTERNOON_HOURS):intHour);
            System.out.print(" O' clock \n \n"); 
        
    }     
  
    /*
    static method displaying remaining days for currenet year
    */
    public static void displayRemainingDays() 
    {
            //Calender instantiation for getting Current year
            GregorianCalendar  calendarCurrentYear = new GregorianCalendar();
            
            //integer variables declarations for year and passed days in the current year
            int intCurrentYear = calendarCurrentYear.get(java.util.Calendar.YEAR);
            int intPassedDays = calendarCurrentYear.get(java.util.Calendar.DAY_OF_YEAR);
            
            //Calender instantiation for getting remaining days
            GregorianCalendar calenderRemainingDays = new GregorianCalendar(intCurrentYear,11,31);
            
            //integer variables declarations for reamining days
            int intDaysOfYear = calenderRemainingDays.get(java.util.Calendar.DAY_OF_YEAR);
            int intRemainingdays = intDaysOfYear - intPassedDays;
            
            //displaying the days remained in the current year
            System.out.println( intRemainingdays + " days remained in the current year \n");
 
    }
   
   
}

