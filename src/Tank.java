public class Tank extends BaseCharacter {
    private int shield;
    private boolean block;
    public Tank(int hp, int speed, int mana, int atk, int def, int shield, boolean block) {
        super(hp, speed, mana, atk, def);
        this.shield = shield;
        this.block = block;
    }

    public int attack() {
        int damage = this.atk + (block ? shield : 0);
        System.out.println("attacks with " + damage + " damage.");
        return damage;
    }
}
