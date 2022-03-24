import java.time.LocalDate;

public class Titulo {
    private double valor;
    private LocalDate data;
    private double multaDiaria;

    public Titulo(double valor,
    LocalDate data,
    double multaDiaria){
        this.multaDiaria = multaDiaria;
        this.data = data;
        this.valor = valor;
    }

    public double getMultaDiaria() {
        return multaDiaria;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

}
