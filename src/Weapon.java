public abstract class Weapon {
    public Material material;

    public Weapon(Material material) {
        this.material = material;
    }

    public abstract Integer damage();
}


