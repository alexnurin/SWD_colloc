public interface Material {
    void hitSound();
}

class Steel implements Material {
    @Override
    public void hitSound() {
        System.out.println("Swing");
    }
}

class Adamant implements Material {
    @Override
    public void hitSound() {
        System.out.println("Bdamts");
    }
}

class Glass implements Material {
    @Override
    public void hitSound() {
        System.out.println("Tssss");
    }
}
