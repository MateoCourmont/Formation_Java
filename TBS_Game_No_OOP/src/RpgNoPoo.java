public class RpgNoPoo {

    // Il existe un player et un enemy
    static int[] player = new int[2];
    static int[] enemy = new int[2];

    // ATTENTION : Va servir à pointer/referencer le joueur en cours d'action
    // Donc si par exemple je fais un moment currentPlayer=enemy
    // Alors cela veut dire currentPlayer est l'adresse mémoire de enemy
    // DONC CE N'EST PAS UN COPIER COLLER DES TABLEAU
    static int[] currentPlayer;

    // Viser quelqu'un
    // L'adresse mémoire/reference de la cible
    static int[] currentTarget;

    // Qui a gagné (qui est le tableau qui a gagné)
    // L'adresse mémoire/reference du gagnant
    static int[] isWinner;

    // Servira à savoir si on joue ou pas
    // Par défaut false car on joue pas
    static boolean isPlaying = false;

    /**
     * Initialiser les données
     */
    public static void initData(){
        // Les données du joueur
        player[0] = 100; // 0 : PV
        player[1] = 34; // 1 : ATK

        // Les données de l'enemie
        enemy[0] = 80; // 0 : PV
        enemy[1] = 22; // 1 : ATK
    }

    /**
     * Va choisir le premier à joueur
     */
    public static void selectFirstPlayer() {
        // TODO : Pour le moment c'est le Player le premier qui joue
        currentPlayer = player;
        currentTarget = enemy;

        System.out.println("Le player joue en premier");
    }

    /**
     * Faire jouer un joueur
     */
    public static void executePlayerAction() {
        // Récupérer l'atk de celui qui attaque
        int damage = currentPlayer[1]; // Attr ATK

        // Stocker le nombre de HP avant ATK
        int previousHP = currentTarget[0];

        // Réduire les PV de la cible par rapport au dégats de celui qui joue
        currentTarget[0] -= damage;

        // Afficher l'action
        System.out.println("----------------------------------------------------");
        System.out.println("Il reste " + previousHP + " PV à la cible");
        System.out.println("La cible a perdu " + damage + " PV");
        System.out.println("Il reste " + currentTarget[0] + " PV à la cible");
        System.out.println("----------------------------------------------------");
        System.out.println("");

        // Si les vies restantes < 1
        // Alors le jeu s'arrete puisque on a au moins un perdant
        if (currentTarget[0] < 1) {
            // On arrête le jeu
            isPlaying = false;
            // On stock le gagnant
            isWinner = currentPlayer;
        }
    }

    /**
     * Selectionner le joueur suivant
     */
    public static void selectNextPlayer() {
        // Si la reference etait le joueur
        // Alors c'est au tour de enemy de jouer
        if (currentPlayer == player){
            currentPlayer = enemy;
            currentTarget = player;

            System.out.println("L'enemy va jouer");
        }
        else {
            currentPlayer = player;
            currentTarget = enemy;

            System.out.println("Le player va jouer");
        }
    }

    /**
     * Afficher le vainqueur
     */
    public static void displayWinner() {
        if (isWinner == player){
            System.out.println("Le player a gagné");
        }
        else {
            System.out.println("L'enemy a gagné");
        }
    }

    /**
     * Tester que la partie n'est pas terminée
     * True : Le la partie n'est pas terminée
     */
    public static boolean isGameRunning() {
        // la condition pour savoir si la partie est terminé ou pas
        return isPlaying;
    }

    /**
     * Entry / Point d'entrée de l'application
     */
    public static void main(String[] args)
    {
        // Initialiser les données des joueurs
        initData();

        // Lancer le jeu
        isPlaying = true;

        // 1 :: Choisir qui joue en premier
        selectFirstPlayer();

        // While = Répéter en boucle le code dans le while
        // tant que la condition est vrai
        while (isGameRunning()) {
            // 2 :: Faire joueur le joueur jouer
            executePlayerAction();
// SI le jeu s'arrête on casse la boucle
            if (!isGameRunning()){
                break;
            }
            // 3 :: Selectionner le joueur suivant
            selectNextPlayer();
        }
        // ? :: Afficher le vainqueur
        displayWinner();
    }
}