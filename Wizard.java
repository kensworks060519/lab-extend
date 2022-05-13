public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void HydroCannon(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName + " with HydroCannon (Damage - 20)");
        int manacost = 25;
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints, manacost);
    };
}
