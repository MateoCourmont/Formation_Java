import java.util.*;

public class Battler {
    private String name;
    private int hp;
    private int power;

    public Battler(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    // Méthode pour attaquer un adversaire
    public void attack(Battler opponent) {
        System.out.println(this.name + " attaque " + opponent.name + " avec " + this.power + " points de puissance !");
        opponent.looseHP(this.power);
    }

    // Méthode pour réduire les points de vie
    public void looseHP(int amount) {
        this.hp -= amount;
        System.out.println(this.name + " perd " + amount + " points de vie. HP restants : " + this.hp);
        if (this.hp <= 0) {
            System.out.println(this.name + " est KO !");
        }
    }

    // Getter pour vérifier si le battler est encore en vie
    public boolean isAlive() {
        return this.hp > 0;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Getter pour les points de vie
    public int getHp() {
        return hp;
    }
}
