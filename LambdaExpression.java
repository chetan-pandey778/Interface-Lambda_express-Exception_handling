@FunctionalInterface
interface Bike {
    void drive(int avg, int ts);
}

public class LambdaExpression {
    public static void main(String args[]) {
        Bike obj = (avg, ts) -> {
            System.out.println("driving... " + avg + " : " + ts);

        };
        obj.drive(50, 168);
    }
}
