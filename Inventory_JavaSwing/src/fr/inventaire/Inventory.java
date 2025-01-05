package fr.inventaire;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    // Liste des objets de type Item
    private List<Item> items;

    // Constructeur
    public Inventory() {
        this.items = new ArrayList<>();
    }

    // Méthode pour ajouter un Item
    public void addItem(String name, int quantity) {
        // Parcourir la liste pour vérifier si l'objet existe déjà
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                // Si l'objet existe remplacer sa quantité
                item.setQuantity(quantity);
                return;
            }
        }
        // Sinon, ajouter un nouvel objet à la liste
        items.add(new Item(name, quantity));
    }

    // Méthode pour afficher les objets
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("L'inventaire est vide.");
        } else {
            System.out.println("Contenu de l'inventaire :");
            for (Item item : items) {
                System.out.println(item.toString());
            }
        }
    }

    // Méthode pour supprimer un Item par son nom
    public void removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)) {
                items.remove(i); // Supprimer l'objet de la liste
                System.out.println("Item \"" + name + "\" supprimé. \n");
                return;
            }
        }
        System.out.println("Item \"" + name + "\" non trouvé.");
    }
}

