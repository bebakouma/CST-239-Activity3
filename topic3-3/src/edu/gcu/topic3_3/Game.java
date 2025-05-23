public class Game {
    public static void main(String[] args) {
        WeaponInterface bomb = new Bomb();
        WeaponInterface gun = new Gun();

        System.out.println("== Activating Weapons ==");
        bomb.activate(true);
        gun.activate(true);

        System.out.println("\n== Firing Weapons (no power) ==");
        bomb.fireWeapon();
        gun.fireWeapon();

        System.out.println("\n== Firing Weapons (with power) ==");
        bomb.fireWeapon(8);
        gun.fireWeapon(12);
    }
}
