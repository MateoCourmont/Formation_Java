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
    private JList<String> inventoryList;
    private DefaultListModel<String> listModel;

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
        listModel = new DefaultListModel<>();
        inventoryList = new JList<>(listModel);

        // Création des panneaux
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Nom :"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Quantité :"));
        inputPanel.add(quantityField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.setBorder(BorderFactory.createTitledBorder("Inventaire"));
        listPanel.add(new JScrollPane(inventoryList), BorderLayout.CENTER);

        // Ajout des panneaux à la fenêtre principale
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(listPanel, BorderLayout.CENTER);

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
                removeItem();
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
            listModel.addElement(name + " - Quantité : " + quantity);

            // Réinitialiser les champs
            nameField.setText("");
            quantityField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "La quantité doit être un entier.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Méthode pour supprimer un objet de l'inventaire
    private void removeItem() {
        int selectedIndex = inventoryList.getSelectedIndex();

        // Vérifier si un élément est sélectionné
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(frame, "Veuillez sélectionner un élément à supprimer.", "Erreur", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Supprimer l'élément sélectionné
        listModel.remove(selectedIndex);
    }
}
