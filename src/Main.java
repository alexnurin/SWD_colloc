public class Main {

    public static void main(String[] args) {
        Weapon[] weapons = {
                new Sword(new Adamant()),
                new Axe(new Steel()),
                new Sword(new Glass())};

        for (Weapon weapon : weapons) {
            System.out.println(weapon.damage() + " damage dealt");
        }
    }
}