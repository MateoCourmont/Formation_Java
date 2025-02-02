package fr.game;
import fr.game.inventory.*;

public class Main {
    public static void main(String[] args) {
        // Créer un inventaire
        Inventory inventory = new Inventory();

        // Créer deux items
        Material crystal = new Material();
        crystal.name = "Crystal";

        Consumable potion = new Consumable();
        potion.name = "Healing Potion";

        // Les ajouter à l'inventaire
        inventory.items.add(crystal);
        inventory.items.add(potion);

        // Afficher l'inventaire
        for (Item item : inventory.items) {
            //
            System.out.println(item.name);

            /**
            // Tester que le childclass de item est un material
            if (item instanceof Material) {
                System.out.println("    -> Is a material");
            }

            // Tester que le childclass de item est un consumable
            if (item instanceof Consumable) {
                System.out.println("    -> Is a consumable");
            }*/

            if (item instanceof Consumable){
                // Récupérer la version consumable de l'item
                // Caster l'item en Consumable pour l'exploiter
                Consumable consumable = (Consumable) item;
                consumable.use();
            }
        }
        // Créer un personnage et l'équiper d'un ou plusieurs items
        Character goulteck = new Character();
        goulteck.pseudo = "Goulteck";

        // Associer l'inventaire au personnage
        goulteck.inventory = inventory;

        // Créer une nouvelle équipement
        Weapon sword = new Weapon();
        sword.name = "Master Sword";
        sword.attributes = new int[]{20, 999}; // 20hp, 999atk

        // L'equiper (associer) au personnage
        goulteck.equippedItem(sword);

        // Appeler getDamage de weapon
        for(Equipment equipment : goulteck.equipments) {
            if (equipment instanceof Weapon) {
                Weapon weapon = (Weapon) equipment;
                System.out.println("Damages of " + weapon.name + " are " + weapon.getDamage());
            }
        }
    }
}