public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private Conta conta;

    public Cliente(String nome, String cpf, String email, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.conta = conta;
    }

    public void visualizarCliente(){
        System.out.println("Dados do Cliente:");
        System.out.println("Nome:" + nome);
        System.out.println("CPF:" + cpf);
        System.out.println("E-mail:" + email);
        System.out.println("Conta:" + conta);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
    public Conta getConta(){
        return conta;
    }
   
    public void setEmail(String email){
        this.email = email;
    }
    

}
