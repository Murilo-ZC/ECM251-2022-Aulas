public class App {
    public static void main(String[] args) throws Exception {
        Produto cornDog = new Comida(12.5, "Corn Dog", 5, "Uma cachorro quente meio errado", EnumCategoriaComida.COREANA, EnumAlergicos.GLUTEM, EnumPimenta.SUAVE);
        Produto acaiMoleza = new Bebida(10.5, "Açai do Moleza", 1, "Real fonte alternativa de energia", EnumCategoriaBebida.SUCO, EnumTemperatura.FRIO);

        System.out.println("Preços Regulares:");
        System.out.println(cornDog.getNome()+":R$"+cornDog.getPreco());
        System.out.println(acaiMoleza.getNome()+":R$"+acaiMoleza.getPreco());

        System.out.println("Preços Com Desconto:");
        System.out.println(cornDog.getNome()+":R$"+precoComDesconto(cornDog));
        System.out.println(acaiMoleza.getNome()+":R$"+precoComDesconto(acaiMoleza));
    }

    public static String precoComDesconto(IGerarDesconto produto){
        return "R$"+produto.gerarDesconto();
    }
}
