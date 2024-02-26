// use of finally in exception handling
import java.util.*;
public class ExceptionSecond {
    public static void main(String args[]){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        // we can't use try without cath or finally if we don't write catch and directly write finally it will work 
        try{
             num = sc.nextInt();
             System.out.println(num);
        }catch(Exception e){
            System.out.println("somthing went wrong");
        }
        finally{
            sc.close();
            System.out.println("closed");
        }
    }
    
}
