public class Jogada {
    private final EnumJogadas venco1;
    private final EnumJogadas venco2;
    public Jogada(EnumJogadas venco1, EnumJogadas venco2) {
        this.venco1 = venco1;
        this.venco2 = venco2;
    }

    public boolean verificarVenceu(Jogada jogada){
        if(jogada.getTipo().equals(venco1))
            return true;
        if(jogada.getTipo().equals(venco2))
            return true;
        return false;
    }

    public EnumJogadas getTipo(){
        return EnumJogadas.PAPEL;
    }
}
