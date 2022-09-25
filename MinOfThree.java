public class MinOfThree {
    public static void main(String []args){
        int a  =  24; 
		int b  = 26; 
		int c  = 28; 
		
		if(a<b)
		{
		   if(a<c){
			System.out.println("Smallest number is: " + a);
		   }else{
			System.out.println("Smallest number is: " + c);
		   }
		}else{
			if(b<c){
				System.out.println("Smallest number is: " + b);
			   }else{
				System.out.println("Smallest number is: " + c);
			}
		}
		
    }
}
