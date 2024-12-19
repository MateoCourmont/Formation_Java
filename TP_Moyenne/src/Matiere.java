import java.util.*;

class Matiere {
    private String libelle;         // Libellé de la matière
    private List<Float> notes;      // Liste des notes

    public Matiere(String libelle){
        this.libelle = libelle;
        this.notes = new ArrayList<>();
    }

    // Méthode pour ajouter une note
    public void ajouterNote(float note) {
        if (note >= 0 && note <= 20) { // Vérifie que la note est valide
            notes.add(note);
        } else {
            System.out.println("Note invalide : " + note + " (doit être entre 0 et 20).");
        }
    }

    // Méthode pour calculer la moyenne des notes
    public float calculerMoyenne() {
        if (notes.isEmpty()) {
            System.out.println("Aucune note disponible pour calculer la moyenne.");
            return 0.0f;
        }

        float somme = 0.0f;
        for (float note : notes) {
            somme += note;
        }

        return somme / notes.size();
    }

    public String getLibelle() {
        return libelle;
    }
}
