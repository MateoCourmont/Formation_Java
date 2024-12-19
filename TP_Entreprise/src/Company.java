public class Company {
    private String libelle;
    private Adress adress;

    public Company(String libelle, Adress adress){
        this.libelle = libelle;
        this.adress = adress;
    }

    public String getLibelle() {
        return libelle;
    }
}

