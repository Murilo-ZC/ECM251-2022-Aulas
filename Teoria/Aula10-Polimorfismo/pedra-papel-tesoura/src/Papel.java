public class Papel extends Jogada{

    public Papel(String venco) {
        super(venco);
    }

    @Override
    public String getTipo() {
        return "Papel";
    }
    
}
