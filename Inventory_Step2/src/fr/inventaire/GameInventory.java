package fr.inventaire;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameInventory {
    private JFrame frame;
    private JTextField nameField;
    private JTextField quantityField;
    private JButton addButton;
    private JButton removeButton;
    private JPanel inventoryGrid;

    public GameInventory() {
        // Initialisation de la fenêtre principale
        frame = new JFrame("Game Inventory");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Initialisation des composants
        nameField = new JTextField(15);
        quantityField = new JTextField(5);
        addButton = new JButton("Ajouter");
        removeButton = new JButton("Supprimer");
        DefaultListModel<String> inventoryItems = new DefaultListModel<>();
        inventoryGrid = new JPanel(new GridLayout(0, 4));
        inventoryGrid.setBorder(BorderFactory.createTitledBorder("Inventaire"));

        // Création des panneaux
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Nom :"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Quantité :"));
        inputPanel.add(quantityField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        // Ajout des panneaux à la fenêtre principale
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(inventoryGrid), BorderLayout.CENTER);

        // Ajout des ActionListeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSelectedItem();
            }
        });

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }

    // Méthode pour ajouter un objet à l'inventaire
    private void addItem() {
        String name = nameField.getText().trim();
        String quantityText = quantityField.getText().trim();

        // Vérification des champs non vides
        if (name.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Vérification que la quantité est un entier valide
        try {
            int quantity = Integer.parseInt(quantityText);
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(frame, "La quantité doit être un entier positif.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Ajouter l'objet à la liste
            String itemText = name + " - Quantité : " + quantity;
            JToggleButton itemButton = new JToggleButton(itemText);
            inventoryGrid.add(itemButton);
            inventoryGrid.revalidate();
            inventoryGrid.repaint();

            // Réinitialiser les champs
            nameField.setText("");
            quantityField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "La quantité doit être un entier.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Méthode pour supprimer les éléments sélectionnés de l'inventaire
    private void removeSelectedItem() {
        Component[] components = inventoryGrid.getComponents();
        boolean itemRemoved = false;

        for (int i = components.length - 1; i >= 0; i--) {
            if (components[i] instanceof JToggleButton button) {
                if (button.isSelected()) {
                    inventoryGrid.remove(button);
                    itemRemoved = true;
                }
            }
        }

        if (!itemRemoved) {
            JOptionPane.showMessageDialog(frame, "Aucun élément sélectionné.", "Erreur", JOptionPane.WARNING_MESSAGE);
        }

        inventoryGrid.revalidate();
        inventoryGrid.repaint();
    }
}

