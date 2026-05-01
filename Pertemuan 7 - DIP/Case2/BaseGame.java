package Case2;

public class BaseGame {
    public void play() {
        NintendoController nintendo;
        XboxController xbox;
        PSController ps;

        nintendo = new NintendoController();
        xbox = new XboxController();
        ps = new PSController();

        // tambah pembagian nintendo, xbox, dan ps
        nintendo.AButton();
        nintendo.BButton();
        nintendo.XButton();
        nintendo.YButton();
        nintendo.leftAnalog();
        nintendo.rightAnalog();
        nintendo.homeButton();
        xbox.AButton();
        xbox.BButton();
        xbox.XButton();
        xbox.YButton();
        xbox.leftAnalog();
        xbox.rightAnalog();
        xbox.homeButton();
        ps.AButton();
        ps.BButton();
        ps.XButton();
        ps.YButton();
        ps.leftAnalog();
        ps.rightAnalog();
        ps.homeButton();
    }
}