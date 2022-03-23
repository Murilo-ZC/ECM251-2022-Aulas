public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Murilo", 
            "456789", 
            "murilo.carvalho@maua.br", 
            new Conta(1234)
        );
        
        System.out.println("Nome do cliente:" + c1.getNome());
        System.out.println("E-mail do cliente:" + c1.getEmail());
        System.out.println("CPF do cliente:" + c1.getCpf());
        c1.getConta().visualizarSaldo();
    }
}
