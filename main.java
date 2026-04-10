import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int tax ;
        int salary = sc.nextInt();

        if (salary <=500000 ){
            tax = 0;
        }
        else if (salary >=500000 && salary<=1200000){
            tax = (int)(salary * 0.2);
        }
        else{
            tax = (int)(salary * 0.3);

        }
        System.out.println("Your Tax is " + tax);
    }
}

