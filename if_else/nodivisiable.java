import java.util.Scanner;

public class nodivisiable {

    // public static void main(String[] args){

    // int a;

    // Scanner m = new Scanner(System.in);

    // a=m.nextInt();

    // if(a%5==0 && a%11==0){
    // System.out.println("divisible");
    // }
    // else{
    // System.out.println("Not divisible");
    // }

    // }

    public static void main(String[] args) {

        int a;

        Scanner m = new Scanner(System.in);

        a = m.nextInt();

        for (int i = 0; i <= a; i++) {

            if (i % 5 == 0 && i % 11 == 0) {
                System.out.println(i);
            }

        }

    }

}
