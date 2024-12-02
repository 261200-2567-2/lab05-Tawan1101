public abstract class BaseAccessory implements Accessory {
    protected int hp;
    protected int speed;
    protected int atk;
    protected int shield;

    public BaseAccessory(int hp, int speed, int atk, int shield) {
        this.hp = hp;
        this.speed = speed;
        this.atk = atk;
        this.shield = shield;
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
    public int getAtk() {
        return atk;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public abstract void applyEffect(RPGCharacter character);
}
