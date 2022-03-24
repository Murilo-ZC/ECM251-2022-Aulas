public class Conta {
    //Atributos da nossa classe
    private int numero;
    private double saldo;
    private Cliente cliente;

    //Construtor
    public Conta(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
        saldo = 0;
    }

    //Métodos da classe
    public String visualizarSaldo(){
        return String.format("R$%.2f", saldo);
    }
    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }
    public boolean sacar(double valor){
        if(valor > saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }
    public boolean transferirDinheiro(double valor, Conta destino){
        if(!sacar(valor)) return false;
        if(!destino.depositar(valor)) return false;
        return true;
    }

    public String toString(){
        return "Numero:"+numero 
        + "\nCliente:" + cliente.getNome()
        + "\nSaldo:" + visualizarSaldo();
    }
}
