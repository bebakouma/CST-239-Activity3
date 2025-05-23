package edu.gcu.topic3_3;

public class Bomb implements WeaponInterface {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Bomb fired with power: " + power);
    }

    @Override
    public void fireWeapon() {
        System.out.println("Bomb fired (no power given)");
        fireWeapon(5); // Default power value
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Bomb activated: " + enable);
    }
}
