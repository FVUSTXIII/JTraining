import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> lista_a = new ArrayList<Student>();
        lista_a.add(new Student(1.60, "Sergio", "Gutierrez"));
        lista_a.add(new Student(1.75, "Federico", "Sandoval"));
        lista_a.add(new Student(1.80, "Aurora", "Anselmo"));
        Collections.sort(lista_a);
        System.out.println("Sorted Alumni: ");
        lista_a.forEach(student -> {
            System.out.println("Last Name: " + student.getLast_name()
                    + " First Name: " + student.getFirst_name() +
                    " Height: " + student.getHeight());
        });

        ArrayList<Candy> lista_b = new ArrayList<Candy>();
        lista_b.add(new Candy("Rocaleta", 1.98));
        lista_b.add(new Candy("Pelón", 1.02));
        lista_b.add(new Candy("Duvalin", 2.56));
        System.out.println("Sorted by name");
        NameComparator name_comparator = new NameComparator();
        Collections.sort(lista_b, name_comparator);
        lista_b.forEach(element -> {
            System.out.println("Candy: " + element.getName() + " Glucose percentaje: " + element.getGlucose_level());
        });

        System.out.println("Sorted by clucose level");
        GlucoseLevelComparator glucose_level_comparator = new GlucoseLevelComparator();
        Collections.sort(lista_b, glucose_level_comparator);
        lista_b.forEach(element -> {
            System.out.println("Candy: " + element.getName() + " Glucose percentaje: " + element.getGlucose_level());
        });

    }
}
