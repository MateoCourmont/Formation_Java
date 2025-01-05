import fr.inventaire.Inventory;

public class Main
{
    public static void main(String[] args) {
        // Création de l'inventaire
        Inventory inventory = new Inventory();

        // Création d'un objet Item
        // Item item = new Item("Caca", 10);
        // System.out.println(item.toString()); // Affiche : Item - Name: [], Quantity: []

        // Modification des attributs
        // item.setName("Pipi");
        // item.setQuantity(15);
        // System.out.println(item.toString());

        // Ajout d'objets
        inventory.addItem("Obj1", 10);
        inventory.addItem("Obj2", 5);
        inventory.addItem("Obj1", 3); // Pour tester la modification d'un objet existant

        // Affichage des objets
        inventory.displayItems();

        // Suppression d'un objet
        inventory.removeItem("Obj2");

        // Affichage après suppression
        inventory.displayItems();

        // Suppression d'un objet non existant
        inventory.removeItem("Obj3");
    }
}