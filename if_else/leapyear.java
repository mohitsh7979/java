import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        
        int year;
        
        Scanner m = new Scanner(System.in);

        year = m.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{

            if(year%4==0){
                System.out.println("Leap year");
            }

            else{
                System.out.println("Not a leap year");
            }
        }


    }
    
}
