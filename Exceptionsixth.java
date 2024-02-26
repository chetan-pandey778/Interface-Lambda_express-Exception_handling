// making custom exception
class MyException extends Exception
{
    public MyException(){
      // no parameter constructor  
    }public MyException(String msg){
           super(msg);
    }
}
public class Exceptionsixth {
    public static void main(String args[]){
        int num1=6;
        int num2=-2;
        try{
            if(num2<0){
                Exception e = new MyException("Negative number");
                // using throw keyword by
                throw e;
            }else{
                int result = num1/num2;
                System.out.println(result);
            }
           
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
