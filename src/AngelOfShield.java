public class AngelOfShield extends BaseAccessory {
    public AngelOfShield(int shield, int def) {
        super(0, 0, 0, shield);
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println("Equipping Angel of Shield...");
        character.equipAccessory(this);
    }
}
