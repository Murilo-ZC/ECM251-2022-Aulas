import java.util.concurrent.ThreadLocalRandom;

public class DadoD10 extends Dado {

    public DadoD10(String id) {
        super(id);
    }

    @Override
    public void rodar() {
        this.face =  ThreadLocalRandom.current().nextInt(1, 11);
    }
    
}
