public class PlacesConfig {
    OrderManager configManager;

    public PlacesConfig(OrderManager configManager) {
        this.configManager = configManager;
    }

    public String takePlaces() {
        char places = configManager.getPlaces();
        if (places == 'Y' || places == 'y') {
            return "Iya.";
        } else if (places == 'X' || places == 'x') {
            return "Tidak.";
        } else {
            return "Mohon input 'Y' atau 'X'.";
        }
    }
}
