package players.Fighter;

import equipment.Weapon;
import equipment.WeaponType;

public class Barbarian extends Fighter{

    private Weapon weapon;

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = new Weapon(WeaponType.CLUB);
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
