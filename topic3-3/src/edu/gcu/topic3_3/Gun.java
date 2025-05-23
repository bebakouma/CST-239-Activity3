package edu.gcu.topic3_3;

public class Gun implements WeaponInterface {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Gun fired with power: " + power);
    }

    @Override
    public void fireWeapon() {
        System.out.println("Gun fired (no power given)");
        fireWeapon(3); // Default power value
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Gun activated: " + enable);
    }
}
