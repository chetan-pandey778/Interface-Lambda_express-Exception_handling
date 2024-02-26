class C {
    public void show() {
        System.out.println("in show");
    }

    // class "D" is inner class of Class "C" and this can be also declared as static
    // because it is D class but "C" is not be define as static
    class D {
        public void display() {
            System.out.println("in display");
        }
    }
}

public class InnerClass {
    public static void main(String args[]) {
        C obj = new C();
        C.D obj1 = obj.new D();
        obj.show();
        obj1.display();
    }

}
