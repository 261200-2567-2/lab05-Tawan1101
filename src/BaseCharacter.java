public abstract class BaseCharacter implements RPGCharacter {
    protected int hp;
    protected int speed;
    protected int mana;
    protected int atk;
    protected int def;

    public BaseCharacter(int hp, int speed, int mana, int atk, int def) {
        this.hp = hp;
        this.speed = speed;
        this.mana = mana;
        this.atk = atk;
        this.def = def;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public void equipAccessory(Accessory accessory) {
        this.hp += accessory.getHp();
        this.speed += accessory.getSpeed();
        this.atk += accessory.getAtk();
        this.def += accessory.getShield();
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
    }
}
