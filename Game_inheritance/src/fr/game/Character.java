package fr.game;
import fr.game.inventory.*;
import java.util.ArrayList;
import java.util.List;

public class Character
{
    /**
     * pseudo du personnage
     */
    public String pseudo;
    /**
     * inventaire du personnage
     */
    public Inventory inventory;

    /**
     * Liste des equipements équipés
     */
    public List<Equipment> equipments = new ArrayList<Equipment>();

    /**
     * Sert à équiper un item
     * @param equipment à équiper
     */
    void equippedItem(Equipment equipment){
        equipments.add(equipment);
        System.out.println("Equipped item : " + equipment.name);
    }
}
