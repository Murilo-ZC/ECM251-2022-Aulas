import java.time.LocalDate;
import java.time.Period;

public class Sistema {
    public void run(){
        Cliente cliente = new Cliente("Endevour", "456789", "putzsousegundo@gmail.com");
        Conta conta = new Conta(9865,
        cliente);
        System.out.println(conta);

        Titulo titulo = new Titulo(686.97, LocalDate.of(2022, 03, 30), 5);

    }

    boolean pagarTitulo(Titulo titulo, Conta conta){
        LocalDate prazo = titulo.getData();
        LocalDate hoje = LocalDate.now();
        double valor;
        if(prazo.compareTo(hoje) <= 0){
            valor = titulo.getValor();
        } else {
            int diasAtraso = Period.between(prazo, hoje).getDays();
            valor = titulo.getValor() + titulo.getValor()*titulo.getMultaDiaria()/100* diasAtraso;
        }
        //TODO Continuar aqui
        return true;
    }
}
