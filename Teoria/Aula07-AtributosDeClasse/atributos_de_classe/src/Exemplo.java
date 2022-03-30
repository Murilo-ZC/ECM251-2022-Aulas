public class Exemplo {
    private String texto;
    private double valor;
    private static int contador = 0;

    public Exemplo(String texto, double valor){
        this.texto = texto;
        this.valor = valor;
        contador += 1;
    }

    public String toString(){
        return "{texto:" + this.texto
        + "\nvalor:" + this.valor 
        + "\ncontador:" + contador + "}";
    }

    public static int getContador(){
        return contador;
    }
}
