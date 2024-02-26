// ducking the method (ducking the exception)
class Femo{
    public void a() throws Exception
    {
          b();
    }
    public void b() throws Exception
    {
        int num1 =5;
        int num2 =0;
        int result = num1/num2;
        System.out.println(result);
    }
}
public class ExceptionFourth {
    public static void main(String[] args) {
        Femo obj = new Femo();
        try{
        obj.a();
        }
        catch(Exception e){
            System.out.println("can't divide by zero "+e.getLocalizedMessage());
        }

    } 
}
