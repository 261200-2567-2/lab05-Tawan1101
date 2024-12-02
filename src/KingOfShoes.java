public class KingOfShoes extends BaseAccessory {
    public KingOfShoes(int hp, int speed) {
        super(hp, speed, 0, 0);
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println("Equipping King of Shoes...");
        character.equipAccessory(this);
    }
}
