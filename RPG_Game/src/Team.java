import java.util.List;

public class Team {
    // Attribut
    private List<Battler> battlers;

    // Constructeur
    public Team(List<Battler> battlers) {
        this.battlers = battlers;
    }

    // Méthode pour vérifier si l'équipe a perdu
    public boolean isLoose() {
        for (Battler battler : battlers) {
            if (battler.isAlive()) {
                return false; // Si un battler est encore en vie, l'équipe n'a pas perdu
            }
        }
        return true; // Tous les battlers sont K.O.
    }

    // Getter pour la liste des battlers
    public List<Battler> getBattlers() {
        return battlers;
    }
}

