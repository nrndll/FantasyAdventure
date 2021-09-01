import equipment.Spell;
import equipment.SpellType;
import org.junit.Before;
import org.junit.Test;
import players.Spellcaster.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Spell spell;

    @Before
    public void before() {
        wizard = new Wizard("Gandalf", 100);
        spell = new Spell(SpellType.FROSTHANDS);
        wizard.addSpell(spell);
    }

    @Test
    public void canGetName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void canAddSpell() {
        assertEquals(1, wizard.getNumberOfSpells());
    }
}
