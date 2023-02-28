import java.util.Scanner;

class maxtwo {

    public static void main(String[] args) {

        int a, b;
        Scanner m=new Scanner(System.in);
        a=m.nextInt();
        b=m.nextInt();
        if(a>b){

            System.out.println(a + "is max");
        }

        else if(a<b){
            System.out.println(b + "is max");
        }

        else{

            System.out.println("Boths are equal");
        }
        
    }
    
} 
    
