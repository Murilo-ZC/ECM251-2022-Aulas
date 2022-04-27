import java.util.concurrent.ThreadLocalRandom;

public class DadoD20 extends Dado{

    public DadoD20(String id) {
        super(id);
    }
    
    @Override
    public void rodar() {
        this.face =  ThreadLocalRandom.current().nextInt(1, 21);
    }
}
