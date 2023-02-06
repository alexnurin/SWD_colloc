public class Axe extends Weapon {
    public Axe(Material material) {
        super(material);
    }

    @Override
    public Integer damage() {
        super.material.hitSound();
        return 8;
    }
}
