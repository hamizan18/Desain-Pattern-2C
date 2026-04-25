public class BaseGame {
    public static void main(String[] args) {
        NintendoController nintendo;
        XboxController xbox;
        PSController ps;

        nintendo = new NintendoController();
        xbox = new XboxController();
        ps = new PSController();

        nintendo.AButton();
        xbox.AButton();
        ps.AButton();
    }
}