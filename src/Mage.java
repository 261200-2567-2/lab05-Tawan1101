public class Mage extends BaseCharacter {
    private int blackDamage;
    private boolean canCastSpell;

    public Mage(int hp, int speed, int mana, int atk, int def, int blackDamage, boolean canCastSpell) {
        super(hp, speed, mana, atk, def);
        this.blackDamage = blackDamage;
        this.canCastSpell = canCastSpell;
    }

    public int attack() {
        int damage = this.atk + (canCastSpell ? blackDamage : 0);
        System.out.println("attacks with " + damage + " damage.");
        return damage;
    }
}
