package fr.graphic;
import javax.swing.*;

public class Demo_List_Person
{
    public static void main(String[] args)
    {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------------------------------------------------
        // CONTENU
        // -------------------------------------------------------

        // Créer une liste de personne
        String[] people = {
                "Isaac", "Christophe", "Jerezouz"
        };

        // Element graphique qui affiche une liste
        JList<String> jList = new JList<>(people);

        // Element pour scroll
        JScrollPane scroll = new JScrollPane(jList);

        // Ajouter le scrollpane dans la fenetre
        frame.add(scroll);

        // Ajouter le scrollpane dans la fenetre
        frame.add(scroll);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
