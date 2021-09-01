package players.Spellcaster;

import equipment.HealingTool;
import equipment.Spell;
import players.Player;

import java.util.ArrayList;

public abstract class Spellcaster extends Player {

    private ArrayList<Spell> spellTome;

    public Spellcaster(String name, int healthPoints) {
        super(name, healthPoints);
        this.spellTome = new ArrayList<>();
    }

    public ArrayList<Spell> getSpellTome() {
        return spellTome;
    }

    public void addSpell(Spell spell) {
        spellTome.add(spell);
    }

    public int getNumberOfSpells() {
        return spellTome.size();
    }
}
