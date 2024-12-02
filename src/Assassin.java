public class Assassin extends BaseCharacter {
    private int redDamage;
    private boolean criticalHit;

    public Assassin(int hp, int speed, int mana, int atk, int def, int redDamage, boolean criticalHit) {
        super(hp, speed, mana, atk, def);
        this.redDamage = redDamage;
        this.criticalHit = criticalHit;
    }

    public int attack() {
        int damage = this.atk + (criticalHit ? redDamage : 0);
        System.out.println("attacks with " + damage + " damage.");
        return damage;
    }
}
