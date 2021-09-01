package players.Spellcaster;

import creatures.Creature;
import creatures.CreatureType;
import equipment.Spell;
import equipment.SpellType;

public class Wizard extends Spellcaster {

    private Spell spell;
    private Creature creature;

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
        this.spell = new Spell(SpellType.FIREBALL);
        this.creature = new Creature(CreatureType.DEGU);
    }
}
