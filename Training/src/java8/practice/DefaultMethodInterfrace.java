package java8.practice;


public class DefaultMethodInterfrace
{
    public static void main(String[] args) {
        Vechicle vechicle = null;
        vechicle.print();
    }
    public interface Vechicle {
        default void print() {
            System.out.println("This is a vehicle");
        }
    }
    public class car implements Vechicle {
        public void print() {
            Vechicle.super.print();
        }
    }
}
