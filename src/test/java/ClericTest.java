import equipment.HealingTool;
import equipment.HealingToolType;
import org.junit.Before;
import org.junit.Test;
import players.Healer.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private HealingTool healingTool;

    @Before
    public void before() {
        cleric = new Cleric("Arwen", 150);
        healingTool = new HealingTool(HealingToolType.POTION);
        cleric.addHealingTool(healingTool);
    }

    @Test
    public void canGetName() {
        assertEquals("Arwen", cleric.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(150, cleric.getHealthPoints());
    }

    @Test
    public void canAddHealingTool() {
        assertEquals(1, cleric.getNumberOfHealingTools());
    }
}
