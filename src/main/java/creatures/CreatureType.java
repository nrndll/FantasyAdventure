package creatures;

public enum CreatureType {
    DEGU(25),
    KOBOLD(50),
    GNOLL(100),
    OGRE(150),
    DRAGON(250);

    private final int healthPoints;

    private CreatureType(int healthPoints) { this.healthPoints = healthPoints; };

    public int getHealthPoints() { return healthPoints; }
}
