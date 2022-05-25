public class App {
    public static void main(String[] args) throws Exception {
        //Cria duas referencias para objetos do tipo Configuracao
        Configuracao c1;
        Configuracao c2;
        //Cria as instâncias
        c1 = new ConfiguracaoDesenvolvimento("localhost", "localhost:5000");
        c2 = new ConfiguracaoProducao("http://aws.meubanco.com", "https://minhamaua.br", "Jorge");
        System.out.println("Conf1:" + c1);
        System.out.println("Conf2:" + c2);

        //Verificação de usuários
        System.out.println(c1.getUser());
        System.out.println(c2.getUser());
    }
}
