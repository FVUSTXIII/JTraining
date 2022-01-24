import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.add(new Pen("This is a pen"));
        lista.add(new Dog("This is a dog"));
        lista.add(new Bird("This is a bird"));

        lista.forEach( elemento -> {
            if (elemento instanceof Pen) {
                System.out.println("This attribute indicates that: " + ((Pen) elemento).getAttribute_one());
            } else if (elemento instanceof Dog) {
                System.out.println("This attribute indicates that: " + ((Dog) elemento).getAttribute_two());
            } else if (elemento instanceof Bird) {
                System.out.println("This attribute indicates that: " + ((Bird) elemento).getAttribute_three());
            }
        });
    }
}
