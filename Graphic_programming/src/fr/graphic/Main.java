package fr.graphic;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        // Créer une fenêtre
        JFrame frame = new JFrame("Graphic");

        // Bouton fermer la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // CONTENU DE LA FENETRE

        // Créer un panel sous forme de grille
        JPanel panel = new JPanel(new java.awt.GridLayout(2, 1));

        // Ajouter le panel dans la fenêtre
        frame.add(panel);

        // Créer un bouton
        JButton button = new JButton("Cookie");

        // Pour ajouter des éléments dans la fenêtre il faut que la fenêtre ait au moins un layout
        // Layout = positionnement des éléments dans la fenêtre
        // frame.setLayout(new java.awt.GridLayout(2, 1));

        // Ajouter un composant (bouton) dans le panel
        panel.add(button);

        // Créer et ajouter un composant (label) dans le panel
        JLabel label = new JLabel("cliquer sur le bouton");
        panel.add(label);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}