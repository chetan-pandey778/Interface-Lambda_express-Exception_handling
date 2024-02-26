//using throw keyword
public class ExceptionFifth {
    public static void main(String args[]){
        int num1=6;
        int num2=-2;
        try{
            if(num2<0){
                Exception e = new Exception("Negative number ");
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
