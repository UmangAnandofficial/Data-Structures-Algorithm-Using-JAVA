public class main{
    public static void main(String[]args){
        int n= 5;
        for(int i=1; i<=n; i++){ //This outerloop is for Making Rows 
            for(int j=1; j<=n-i;j++){ // This inner loop is for printing "Stars"..
                System.out.print(" ");
            }for(int j= 1; j<2*i-1; j++){  // This loop is for printing "*"..
                System.out.print("*");
            }System.out.println(); //  This print statement is for printing each rows to the next line ...
        }
    }

}