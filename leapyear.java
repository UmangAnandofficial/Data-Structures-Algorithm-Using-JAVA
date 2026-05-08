import java.util.*;
public class leapyear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year % 4==0 && year % 100 !=0 ){
            System.out.print("Year is leap");
        }else{
            System.out.print("Year is not leap");
        }sc.close();
    }

    
}
