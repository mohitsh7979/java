import java.util.Scanner;

public class minthree {

    public static void main(String[] args) {

        int a, b, c;

        Scanner m = new Scanner(System.in);

        System.out.print("Enter your first digit : ");
        a = m.nextInt();

        System.out.print("Enter your second digit : ");
        b = m.nextInt();

        System.out.println(" Enter your third digit : ");
        c = m.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " " + "is grater");
            } else {
                System.out.println(c + " " + "is grater");
            }
        }

        else {

            if (b > c) {
                System.out.println(b + " " + "is grater");

            }
            else{

                System.out.println(c + " "+"is grater");

            }
        }

    }

}
