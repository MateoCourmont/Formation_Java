import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création des combattants pour chaque équipe
        Battler player = new Battler("Jerezouz", 30, 10);
        Battler enemy = new Battler("Bebrice", 25, 13);

        // Création des équipes
        Team playerTeam = new Team(List.of(player));
        Team enemyTeam = new Team(List.of(enemy));

        // Création et lancement du jeu
        Game game = new Game(playerTeam, enemyTeam);
        game.play();

        // Affichage de l'équipe gagnante
        game.getWinnerTeam();
    }
}
