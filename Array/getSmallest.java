import java.util.* ;

public class getSmallest{
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0 ; i<numbers.length ; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            
        }
        return smallest ;
    }
    
    public static void main(String[]args){
        
    int numbers[] = { 5, 6 , 12 , 8  } ;
    System.out.print("The largest number is :  " + getSmallest(numbers));
    
   
    
    
    
    }
}