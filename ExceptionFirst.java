//try block with multiple catch blocks
public class ExceptionFirst {
    public static void main(String args[]){
        int num1=6;
        int num2=0;
        int result =0;
        int arr[]={1,2,3,4};
        try{
            result = num1/num2;
            System.out.println(arr[4]);
        }catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("enter " +arr.length +"value");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
