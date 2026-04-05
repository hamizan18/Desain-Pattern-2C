import java.util.Scanner;

public class PlacesConfig {
    
    public static String takePlaces(Scanner scanner) {

        while (true) {
            System.out.print("Makan ditempat(Y) or takeaway(N)?: ");
            char places = scanner.next().charAt(0);
            
            if (places == 'Y' || places == 'y') {
                String text = "Iya.";
                return text;
            } else if (places == 'N' || places == 'n') {
                String text = "Tidak.";
                return text;
            } else
            System.out.println("Mohon ketik 'N' atau 'Y'.");
        }
        
    }
}
