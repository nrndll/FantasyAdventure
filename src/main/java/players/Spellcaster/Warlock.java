package players.Spellcaster;

import creatures.Creature;
import creatures.CreatureType;
import equipment.Spell;
import equipment.SpellType;

public class Warlock extends Spellcaster {

    private Spell spell;
    private Creature creature;

    public Warlock(String name, int healthPoints) {
        super(name, healthPoints);
        this.spell = new Spell(SpellType.LIGHTNINGSTRIKE);
        this.creature = new Creature(CreatureType.KOBOLD);
    }
}
