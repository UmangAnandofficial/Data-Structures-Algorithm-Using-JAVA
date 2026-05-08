import java .util.*;
public class main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    
   if(num >0){
    System.out.print("Number is positive ");

   }else if(num < 0){
    System.out.print("Number is negative");
   }else{
    System.out.print("Number is Zero");
   }sc.close();


    }
}