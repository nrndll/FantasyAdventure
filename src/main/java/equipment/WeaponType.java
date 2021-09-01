package equipment;

public enum WeaponType {
    FISTS(10),
    SWORD(100),
    AXE(200),
    CLUB(50);

    private final int attackDamage;

    WeaponType(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}