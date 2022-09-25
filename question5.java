import java.util.Scanner;
import java.lang.Math;
public class question5 {
    public static void main(String []args){
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter the value of n");

        int n = myObj.nextInt();
        myObj.close();
        int[][] powers = new int[n][4]; // 2-d array to represent values of second, third and fourth power
        
        for(int i=1;i<=n;i++){
            powers[i-1][0] = i;
            powers[i-1][1] = (int)Math.pow(i, 2); // Second power
            powers[i-1][2] = (int)Math.pow(i, 3); // Third power
            powers[i-1][3] = (int)Math.pow(i, 4); // Fourth power
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<4;j++){
                System.out.print(powers[i-1][j]+ " ");
            }
            System.out.println();
        }

    }
}
