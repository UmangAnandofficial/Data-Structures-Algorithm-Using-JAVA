public class practice {
  public static void main(String[] args) {

    int n = 121 ;
    int original = n ;
    int reverse = 0;

    while(n>0){
      int lastdigit = n %10 ;
      reverse = reverse * 10 + lastdigit ;

      n = n/10 ;
    }
    if(original == reverse){
      System.out.print(original + " :This is a palindrome");
    }else{
      System.out.print(original + " :This is not a palindrome");
    }

  }
}