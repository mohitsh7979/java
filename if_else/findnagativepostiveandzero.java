import java.util.Scanner;

public class findnagativepostiveandzero {

    public static void main(String[] args) {
        
        int a;

        Scanner m = new Scanner(System.in);

        a=m.nextInt();

        if(a>0){
            System.out.println("Positive no ");
        }
        else if(a<0){
            System.out.println("Nagative no");
        }
        else{
            System.out.println("Zero no");
        }
    }
    
}
