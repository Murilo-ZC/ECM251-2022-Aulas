public class App {
    public static void main(String[] args) throws Exception {
        Produto manga = new Literatura(29.9, 10, "Foda pa baralho", "Gantz", "JDBC", "Alguem", 100, EnumGeneroLiteratura.ENGENHARIA);
        Produto coca = new Bebida(6.0, 8, "PResente dos deuses", "Coca-Cola", 350, EnumTemperaturas.FRIO, EnumAlergias.GLUTEN  , EnumTiposBebida.REFRIGERANTE);
        Produto tepokki = new Comida(24.5, 10, "Nhoque de Arroz", "Teppoki", 0.5, "Coreano", EnumAlergias.GLUTEN, EnumTipoComida.APIMENTADA);

        System.out.println("Preços Regulares:");
        System.out.println(manga.getNome() + ":R$" + manga.getPreco());
        System.out.println(coca.getNome()+":R$"+coca.getPreco());
        System.out.println(tepokki.getNome()+ ":R$" + tepokki.getPreco());

        System.out.println("Preços com Desconto:");
        System.out.println(manga.getNome() + getPrecoComDesconto(manga));
        System.out.println(coca.getNome() + getPrecoComDesconto(coca));
        System.out.println(tepokki.getNome() + getPrecoComDesconto(tepokki));
        Teste teste = new Teste();
        System.out.println("Teste" + getPrecoComDesconto(teste));
    }

    public static String getPrecoComDesconto(IGerarDesconto produto){
        return "R$"+produto.gerarPrecoComDesconto();
    }
}
