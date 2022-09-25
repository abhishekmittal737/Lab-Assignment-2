import java.util.Scanner;
public class question3 {
    public static void main(String []args){

        int month; 
		 Scanner myObj = new Scanner(System.in); 
		 System.out.println("Enter value of month from 1 to 12");
		 month = myObj.nextInt() ;
		 myObj.close();
		switch(month)
		{
		case 1:
		    System.out.println("Month is January");
            System.out.println("Number of days are: 31");
		    break;
		  case 2:
		    System.out.println("Month is February");
            System.out.println("Number of days in common year are: 28 and in leap year number of days are: 29" );
		    break;
		  case 3:
		    System.out.println("Month is March");
            System.out.println("Number of days are: 31");
		    break;
		  case 4:
		    System.out.println("Month is April");
            System.out.println("Number of days are: 30");
		    break;
		  case 5:
		    System.out.println("Month is May");
            System.out.println("Number of days are: 31");
		    break;
		  case 6:
		    System.out.println("Month is June");
            System.out.println("Number of days are: 30");
		    break;
		  case 7:
		    System.out.println("Month is July");
            System.out.println("Number of days are: 31");
		    break;
		  case 8:
			  System.out.println("Month is August");
              System.out.println("Number of days are: 31");
			  break ; 
		  case 9:
			  System.out.println("Month is September");
              System.out.println("Number of days are: 30");
			  break ;
		  case 10:
			  System.out.println("Month is October");
              System.out.println("Number of days are: 31");
			  break ; 
		  case 11:
			  System.out.println("Month is November");
              System.out.println("Number of days are: 30");
			  break ;
		  case 12:
			  System.out.println("Month is December");
              System.out.println("Number of days are: 31");
			  break;
  		
		}

    }
}
