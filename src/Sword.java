public class Sword extends Weapon {
    public Sword(Material material) {
        super(material);
    }

    @Override
    public Integer damage() {
        super.material.hitSound();
        return 12;
    }
}
