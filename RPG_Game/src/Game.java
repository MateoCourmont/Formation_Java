import java.util.List;

public class Game {
    // Attributs
    private Team playerTeam;
    private Team enemyTeam;

    // Constructeur
    public Game(Team playerTeam, Team enemyTeam) {
        this.playerTeam = playerTeam;
        this.enemyTeam = enemyTeam;
    }

    // Méthode pour jouer le jeu
    public void play() {
        System.out.println("Début du combat !");

        // Boucle jusqu'à ce qu'une équipe perde
        while (!playerTeam.isLoose() && !enemyTeam.isLoose()) {
            for (int i = 0; i < playerTeam.getBattlers().size(); i++) {
                if (playerTeam.getBattlers().get(i).isAlive() && i < enemyTeam.getBattlers().size()) {
                    Battler player = playerTeam.getBattlers().get(i);
                    Battler enemy = enemyTeam.getBattlers().get(i);

                    if (enemy.isAlive()) {
                        player.attack(enemy);
                    }

                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                }
            }
        }
        System.out.println("Le combat est terminé !");
    }

    // Méthode pour récupérer l'équipe gagnante
    public Team getWinnerTeam() {
        if (playerTeam.isLoose()) {
            System.out.println("L'équipe adverse a gagné !");
            return enemyTeam;
        } else {
            System.out.println("L'équipe du joueur a gagné !");
            return playerTeam;
        }
    }
}
