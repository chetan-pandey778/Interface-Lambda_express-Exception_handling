interface E{
    void config();
    default void fig(){
        System.out.println("in deafult fig method");
    }
    static void  show(){
      System.out.println("in static show method");
    }
}
  class F implements E{
    public void config(){
        System.out.println("in config method");
    }
  }
   
public class Java8Fe {
  public static void main(String args[]){
         // for static method
           E.show();
          // for non static method
         E obj = new F();
         obj.config();
         obj.fig();
  }    
}
