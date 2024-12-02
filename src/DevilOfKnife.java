public class DevilOfKnife extends BaseAccessory {
    public DevilOfKnife(int atk) {
        super(0, 0, atk, 0);
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println("Equipping Devil of Knife...");
        character.equipAccessory(this);
    }
}
