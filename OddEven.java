import java.util.Scanner;

public class OddEven {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Integer Number");

        int n ;

        n = sc.nextInt();

       System.out.println("Enter The Number:");

         if(n %2 ==0){
            System.out.println("Number Is Even");
        }
        else{
            System.out.println("Number Is odd");
        }

    }
    
}
