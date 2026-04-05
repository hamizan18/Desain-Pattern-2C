import java.util.Scanner;

public class PlacesConfig {
    
    public static String takePlaces() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Makan ditempat(y) or takeaway(n)?: ");
                char places = scanner.next().charAt(0);
                
                scanner.close();
                if (places == 'Y' || places == 'y') {
                    String text = "Iya.";
                    return text;
                } if (places == 'X' || places == 'x') {
                    String text = "Tidak.";
                    return text;
                }
            } catch (exception e) {
                System.out.println("Mohon ketik 'X' atau 'Y'.");
            }
        }
        
    }
}
