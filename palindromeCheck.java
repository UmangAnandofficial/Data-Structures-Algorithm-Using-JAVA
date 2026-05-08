import java.util.*;
public class palindromeCheck{

    public static boolean palindrome(int numbers){
        
        int original = numbers;
        int reverse = 0;

        while (numbers>0) {

            int digit = numbers%10;
            reverse = reverse*10+digit ;
            numbers = numbers/10;
            
        }
        return original == reverse;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        if(palindrome(numbers)){
            System.out.print("This is a palindrome");
        }else{
            System.out.print("This is not a palindrome");
        }
        sc.close();
    }
}