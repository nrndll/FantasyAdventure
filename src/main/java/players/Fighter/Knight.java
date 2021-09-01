package players.Fighter;

import equipment.Weapon;
import equipment.WeaponType;

public class Knight extends Fighter {

    private Weapon weapon;

    public Knight(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = new Weapon(WeaponType.SWORD);
    }
}
