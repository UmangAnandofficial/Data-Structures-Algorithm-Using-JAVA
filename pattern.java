// public class pattern {
//     public static void main(String[] args) {

//         int n = 5;

//         for (int i = 0; i < n; i++) {

//             // U
//             for (int j = 0; j < n; j++) {
//                 if ((j == 0 || j == n - 1) && i != n - 1 ||
//                     (i == n - 1 && j > 0 && j < n - 1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.print("  ");

//             // M
//             for (int j = 0; j < n; j++) {
//                 if (j == 0 || j == n - 1 || (i == j && i <= n/2) || (i + j == n - 1 && i <= n/2)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.print("  ");

//             // A
//             for (int j = 0; j < n; j++) {
//                 if ((i == 0 && j > 0 && j < n - 1) ||
//                     (i == n/2) ||
//                     (j == 0 && i > 0) ||
//                     (j == n - 1 && i > 0)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.print("  ");

//             // N
//             for (int j = 0; j < n; j++) {
//                 if (j == 0 || j == n - 1 || i == j) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.print("  ");

//             // G
//             for (int j = 0; j < n; j++) {
//                 if ((i == 0 && j > 0) ||
//                     (i == n - 1 && j > 0) ||
//                     (j == 0 && i > 0 && i < n - 1) ||
//                     (j == n - 1 && i >= n/2) ||
//                     (i == n/2 && j >= n/2)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

import java .util.*;
public class pattern{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();  
      for(int i= n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }System.out.println();
      }   
    }
}
