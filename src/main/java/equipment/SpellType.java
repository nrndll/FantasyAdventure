package equipment;

public enum SpellType {

    FIREBALL(150),
    LIGHTNINGSTRIKE(300),
    FROSTHANDS(100);

    private final int spellDamage;

    SpellType(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
