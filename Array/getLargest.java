import java .util.* ;
public class getLargest {


 public static int getLargest(int numbers[]){
  int largest = Integer.MIN_VALUE;

  for(int i =0 ; i <numbers.length ; i++){

   if(largest < numbers[i]){
    largest = numbers[i];
   }
  }
  return largest ;
 }
public static void main(String[]args){
  int numbers[] = { 5, 6 , 8 , 9};

  System.out.println("the largest number is : " + getLargest(numbers));
 }
 
}
