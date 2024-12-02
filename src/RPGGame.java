import java.util.Scanner;

public class RPGGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the player's name
        System.out.println("Enter your character's name: ");
        String name = scanner.nextLine();

        // Choose character class
        System.out.println("Choose your character class: ");
        System.out.println("1. Mage");
        System.out.println("2. Tank");
        System.out.println("3. Assassin");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        RPGCharacter character = null;

        switch (choice) {
            case 1:
                // Mage has blackDamage and canCastSpell
                character = new Mage(100, 50, 80, 30, 20, 15, true);  // Adjusting the parameters to match the Mage class
                break;
            case 2:
                // Mage has blackDamage and canCastSpell
                character = new Tank(150, 30, 50, 20, 20, 35, true);  // Adjusting the parameters to match the Mage class
                break;
            case 3:
                // Assassin has redDamage and criticalHit
                character = new Assassin(90, 60, 30, 50, 15, 20, true);  // Adjusting the parameters to match the Assassin class
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Mage.");
                character = new Mage(100, 50, 80, 30, 20, 15, true);
        }

        // Choose accessories
        System.out.println("Choose your accessory: ");
        System.out.println("1. King of Shoes");
        System.out.println("2. Devil of Knife");
        System.out.println("3. Angel of Shield");
        int accessoryChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        Accessory accessory = null;

        switch (accessoryChoice) {
            case 1:
                accessory = new KingOfShoes(10, 20);
                break;
            case 2:
                accessory = new DevilOfKnife(15);
                break;
            case 3:
                accessory = new AngelOfShield(10, 5);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to King of Shoes.");
                accessory = new KingOfShoes(10, 20);
        }

        // Equip accessory
        character.equipAccessory(accessory);
        System.out.println("Equipped " + accessory.getClass().getSimpleName() + " to your character.");

        // Show character stats after equipping accessory
        System.out.println(name + " Stats:");
        System.out.println("HP: " + character.getHp());
        System.out.println("Speed: " + character.getSpeed());
        System.out.println("Attack: " + character.getAtk());
        System.out.println("Defense: " + character.getDef());

        // Simulate a battle with a Demon
        Demon demon = new Demon(120, 30, 0, 40, 10);
        System.out.println("A Demon has appeared!");

        // Battle loop
        while (character.getHp() > 0 && demon.getHp() > 0) {
            // Player's turn
            System.out.println("Your turn! Attacking the Demon...");
            int damage = 0;
            if (character instanceof Mage) {
                damage = ((Mage) character).attack();
            } else if (character instanceof Assassin) {
                damage = ((Assassin) character).attack();
            }
            demon.takeDamage(damage);
            System.out.println("Demon's HP: " + demon.getHp());

            if (demon.getHp() <= 0) {
                System.out.println("You defeated the Demon!");
                break;
            }

            // Demon’s turn
            System.out.println("Demon's turn! Attacking you...");
            character.takeDamage(demon.getAtk());
            System.out.println(name + "'s HP: " + character.getHp());

            if (character.getHp() <= 0) {
                System.out.println("You were defeated by the Demon.");
            }
        }

        scanner.close();
    }
}
