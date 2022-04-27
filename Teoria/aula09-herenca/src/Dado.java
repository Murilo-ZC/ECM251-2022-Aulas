import java.util.concurrent.ThreadLocalRandom;

public class Dado {
    private String id;
    protected int face;

    public Dado(String id) {
        this.id = id;
        rodar();
    }

    public int faceAtual(){
        return this.face;
    }

    public void rodar(){
        this.face = ThreadLocalRandom.current().nextInt(1,7);
    }

    @Override
    public String toString() {
        return "Dado [face=" + face + ", id=" + id + "]";
    }
}
