import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Fighter.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Weapon weapon;

    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 300);
        weapon = new Weapon(WeaponType.SWORD);
        barbarian.addWeapon(weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(300, barbarian.getHealthPoints());
    }

    @Test
    public void canAddWeapon() {
        assertEquals(1, barbarian.getNumberOfWeapons());
    }
}
