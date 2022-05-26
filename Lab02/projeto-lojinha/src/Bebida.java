public class Bebida extends Produto {
    private final int volume;
    private final EnumTemperaturas temperatura;
    private final EnumAlergias alergias;
    private final EnumTiposBebida tipo;
    public Bebida(double preco, int quantidade, String descricao, String nome, int volume, EnumTemperaturas temperatura,
            EnumAlergias alergias, EnumTiposBebida tipo) {
        super(preco, quantidade, descricao, nome);
        this.volume = volume;
        this.temperatura = temperatura;
        this.alergias = alergias;
        this.tipo = tipo;
    }
    public int getVolume() {
        return volume;
    }
    public EnumTemperaturas getTemperatura() {
        return temperatura;
    }
    public EnumAlergias getAlergias() {
        return alergias;
    }
    public EnumTiposBebida getTipo() {
        return tipo;
    }
    @Override
    public double gerarPrecoComDesconto() {
        return getPreco()*0.9;
    }
}
