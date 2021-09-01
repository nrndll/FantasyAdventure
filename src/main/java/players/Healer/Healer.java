package players.Healer;

import equipment.HealingTool;
import equipment.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private ArrayList<HealingTool> pouch;

    public Healer(String name, int healthPoints) {
        super(name, healthPoints);
        this.pouch = new ArrayList<>();
    }

    public ArrayList<HealingTool> getBag() {
        return pouch;
    }

    public void addHealingTool(HealingTool healingTool) {
        pouch.add(healingTool);
    }

    public int getNumberOfHealingTools() {
        return pouch.size();
    }
}
