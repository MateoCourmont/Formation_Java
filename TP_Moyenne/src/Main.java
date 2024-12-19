public class Main {
    public static void main(String[] args) {
        // Création d'une matière avec un libellé
        Matiere fr = new Matiere("Français");

        // Ajout de notes à la matière
        fr.ajouterNote(12.0f);
        fr.ajouterNote(8.0f);
        fr.ajouterNote(13.0f);
        fr.ajouterNote(6.0f);

        // Calcul et affichage de la moyenne
        System.out.println("Matière : " + fr.getLibelle());
        System.out.println("Moyenne des notes : " + fr.calculerMoyenne());

        Matiere math = new Matiere("Mathématiques");

        // Ajout de notes à la matière
        math.ajouterNote(4.0f);
        math.ajouterNote(9.0f);
        math.ajouterNote(16.0f);
        math.ajouterNote(18.0f);

        // Calcul et affichage de la moyenne
        System.out.println("Matière : " + math.getLibelle());
        System.out.println("Moyenne des notes : " + math.calculerMoyenne());

        Matiere eps = new Matiere("Sport");

        // Ajout de notes à la matière
        eps.ajouterNote(15.0f);
        eps.ajouterNote(13.0f);
        eps.ajouterNote(17.0f);
        eps.ajouterNote(2.0f);
        eps.ajouterNote(6.0f);


        // Calcul et affichage de la moyenne
        System.out.println("Matière : " + eps.getLibelle());
        System.out.println("Moyenne des notes : " + eps.calculerMoyenne());
    }
}
