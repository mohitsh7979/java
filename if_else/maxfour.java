import java.util.Scanner;

public class maxfour {

    public static void main(String[] args){

        int a,b,c,d;
        Scanner m=new Scanner(System.in);
        a=m.nextInt();
        b=m.nextInt();
        c=m.nextInt();
        d=m.nextInt();

        if(a>b){
            if(a>c){
                if(a>d){

                    System.out.println("a is grater");

                }
                else{
                    System.out.println("d is grater");
                }
            }
            else{
                if(c>d){
                    System.out.println("c is grater");
                }

                else{
                    System.out.println("d is grater");
                }
            }
        }

        else{

            if(b>c){
                if(b>d){
                    System.out.println("b is grater");
                }
                else{
                    System.out.println("d is grater");
                }
            }
            else{

                if(c>d){
                    System.out.println("c is grater");
                }
                else{
                    System.out.println("d is grater");
                }
            }
        }

    }
    
}
