import java.util.*;
public class averageof3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.print("your three number average is :" + average);

    }
    
}
