public class Adress {
    private String cp;
    private String city;

    public Adress(String cp, String city){
        this.cp = cp;
        this.city = city;
    }

    public String formatAddress() {
        // Formatage de l'adresse
        return cp + " - " + city;
    }
}
