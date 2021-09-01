package players.Healer;

import equipment.HealingTool;
import equipment.HealingToolType;

public class Cleric extends Healer {

    private HealingTool healingTool;

    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
        this.healingTool = new HealingTool(HealingToolType.POTION);
    }
}
