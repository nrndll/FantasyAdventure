package equipment;

public enum HealingToolType {

    POTION(100),
    HERB(200),
    RAG(50);

    private final int healingAmount;

    HealingToolType(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }
}
