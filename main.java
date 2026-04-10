import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)){
            System.out.print("A is the largest number");
        }
        else if ( B >= C){
            System.out.print("B is largest ");
        }
        
        else{
            System.out.print("C : is the Largest");
        }
    }
}