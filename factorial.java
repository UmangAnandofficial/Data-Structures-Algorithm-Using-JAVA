// import java.util.*;
// public class factorial {
//     public static void main(String[]args){
//         Scanner sc  = new Scanner(System.in);
//         int n = sc.nextInt();

//         int f = 1;

//         for(int i=1; i<=n; i++){
//             int factorial = f*i;

            
//         }return factorial;
        

        
//     }
    
// }
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long f = 1; /// Becouse int can make the factorial for larger number like - 20 , 30 ( so we'll  use  "Long " )

        for (int i = 1; i <= n; i++) {
            f = f * i;   // update f
        }

        System.out.println("Factorial = " + f);

        sc.close();
    }
}
