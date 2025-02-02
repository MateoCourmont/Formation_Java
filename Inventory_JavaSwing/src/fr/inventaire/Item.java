package fr.inventaire;

public class Item {
    // Attributs privés
    private String name;
    private int quantity;

    // Constructeur
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) { // Vérifie que la quantité est valide
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("La quantité ne peut pas être négative.");
        }
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Item - Name: " + name + ", Quantity: " + quantity + "\n";
    }
}

