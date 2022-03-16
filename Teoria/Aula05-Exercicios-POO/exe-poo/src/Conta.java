public class Conta {
    //Atributos da nossa classe
    int numero;
    String titular;
    double saldo;
    String cpf;

    //Métodos da classe
    void visualizarSaldo(){
        System.out.println("Saldo atual na conta " + numero+ ": R$" + saldo);
    }
    boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }
    boolean sacar(double valor){
        if(valor > saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }
    boolean transferirDinheiro(double valor, Conta destino){
        if(!sacar(valor)) return false;
        if(!destino.depositar(valor)) return false;
        return true;
    }
}
