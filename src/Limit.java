//write java program Text area or String array should accept upto 500 character and after it should
// give warning and return negative value.
import java.util.Scanner;
public class Limit {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);
       String arr[] = new String[5];
       try{
           for(int i=0;i< 6;i++)
           {
              arr[i]= s.next();

           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Warning: Array index is out of bounds");
       }
    }
}