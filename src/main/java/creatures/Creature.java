package creatures;

public class Creature {

    private CreatureType creatureType;
    private int healthPoints;

    public Creature(CreatureType creatureType) {
        this.creatureType = creatureType;
        this.healthPoints = creatureType.getHealthPoints();
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

}
