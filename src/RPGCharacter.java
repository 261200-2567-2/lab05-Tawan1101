public interface RPGCharacter {
    int getHp();
    int getSpeed();
    int getMana();
    int getAtk();
    int getDef();
    void equipAccessory(Accessory accessory);
    void takeDamage(int damage);
}
