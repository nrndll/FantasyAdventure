package players.Fighter;

import equipment.Weapon;
import equipment.WeaponType;
import interfaces.IAttack;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IAttack {

    private ArrayList<Weapon> bag;
    private Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.bag = new ArrayList<>();
        this.weapon = weapon;
    }

    public ArrayList<Weapon> getBag() {
        return bag;
    }

    public void addWeapon(Weapon weapon) {
        bag.add(weapon);
    }

    public int getNumberOfWeapons() {
        return bag.size();
    }

    public void attack(Player player) {
        int attackDamage = weapon.getWeaponType().getAttackDamage();
        player.takeDamage(attackDamage);
    }

}
