interface Computer{
  void compile();
} 
  class Desktop implements Computer{
    public void compile(){
        System.out.println("You got 5 erroe, faster");
    }

  }
   class Laptop implements Computer{
    public void compile(){
        System.out.println("You got 5 error");
    }
   }

class Devloper{
    public void BuildApp(Computer obj){
        System.out.println("Compiled a code");
    }
}

public class Main {
    public static void main(String args[]){
        Computer obj = new Desktop();
        Devloper dev = new Devloper();
        dev.BuildApp(obj);
    }
    
}
