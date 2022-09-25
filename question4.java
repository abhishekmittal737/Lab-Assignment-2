public class question4{
    public static void main(String []args){
        int population = 80000;
        int incRate = 5;
        int year = 0;
        while(population<=150000){
            population += (int)(incRate*population)/100;
            year++;
        }
        System.out.println(year);
    }
}