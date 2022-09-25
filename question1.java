import java.util.Scanner;
public class question1 {
    public static void main(String []args){
    double score; 
	 Scanner myObj = new Scanner(System.in);  // Taking value of score as input from user
	 System.out.println("Enter value of score");
	 score = myObj.nextDouble() ;
     myObj.close();
	 if(score>=80 && score<=90)
	 {
        score = score+5 ; // Increasing score by 5 if lies between 80 and 90
	 }
	 System.out.println((double)score);

	}
    
}
