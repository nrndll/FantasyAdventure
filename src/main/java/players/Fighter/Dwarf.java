package players.Fighter;

import equipment.Weapon;
import equipment.WeaponType;

public class Dwarf extends Fighter {

    private Weapon weapon;

    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = new Weapon(WeaponType.AXE);
    }
}
