import java.util.concurrent.ThreadLocalRandom;

public class Sistema {
    public static void rodar(){
        //Usuario escolhe a jogada
        Jogada jogada1 = new Tesoura();
        //Sorteio da jogada para o PC
        Jogada jogada2 = sortearJogada();
        //Avaliação das jogadas
        String resultado = avaliaJogadas(jogada1, jogada2);
        //Exibição do resultado
        System.out.println("Resultado:" + resultado);
    }

    private static Jogada sortearJogada() {
        Jogada jogadas[] = new Jogada[3];
        jogadas[0] = new Pedra();
        jogadas[1] = new Papel();
        jogadas[2] = new Tesoura();
        return jogadas[ThreadLocalRandom.current().nextInt(jogadas.length)];
    }

    private static String avaliaJogadas(Jogada jogada1, Jogada jogada2) {
        if(jogada1.verificarVenceu(jogada2))
            return "Jogada 1";
        if(jogada2.verificarVenceu(jogada1))
            return "Jogada 2";
        return "Empate";
    }
}
