import com.faust.army.CircleOfDeath;

import java.util.Scanner;

public class ejercicio_2_soliders {
    public static void main(String[] args) {
        System.out.println("How big is your army?");
        Scanner input_scanner = new Scanner(System.in);
        int army_size = input_scanner.nextInt();
        CircleOfDeath c_o_d = new CircleOfDeath(army_size);
        c_o_d.show();
        System.out.println("What's your current position?");
        int current_position = input_scanner.nextInt();
        c_o_d.simulateCollectiveSuicide(current_position);
    }
}
