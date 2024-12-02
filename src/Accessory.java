public interface Accessory {
    int getHp();
    int getSpeed();
    int getAtk();
    int getShield();
    void applyEffect(RPGCharacter character);
}
