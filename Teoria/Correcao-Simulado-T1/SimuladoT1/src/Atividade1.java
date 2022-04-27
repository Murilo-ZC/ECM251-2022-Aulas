public class Atividade1 {
    public static void run(){
        Usuario usuario1 = new Usuario("All Might", "132456", "naotenhoemail@gmail.com");
        Usuario usuario2 = new Usuario("One For All", "hghayuqhwu$%ahsjkhag&^15", "all@gmail.com");
        Usuario usuario3 = new Usuario("Bakugo", "132456", "tchaudeku@gmail.com");

        usuario1.getConta().depositar(1000);
        usuario2.getConta().depositar(250);
        usuario3.getConta().depositar(3000);

        String qrCode1 = Transacoes.gerarQrCode(usuario1.getConta().getIdConta(), usuario1.getNome(), 250);
        
        System.out.println("Transacao 1:" + usuario2.getConta().transferir(extraiValorQrCode(qrCode1), usuario1.getConta()));
        System.out.println("Transacao 2:" + usuario3.getConta().transferir(extraiValorQrCode(qrCode1), usuario1.getConta()));
        System.out.println("Transacao 3:" + usuario2.getConta().transferir(extraiValorQrCode(qrCode1), usuario1.getConta()));

        String qrCode2 = Transacoes.gerarQrCode(usuario2.getConta().getIdConta(), usuario2.getNome(), 1000);

        System.out.println("Transacao 4:" + usuario3.getConta().transferir(extraiValorQrCode(qrCode2), usuario2.getConta()));
    }

    private static double extraiValorQrCode(String qrCode){
        String valorComVirgula = qrCode.split(";")[2];
        String valorSemVirgula = valorComVirgula.replace(',', '.');
        return Double.parseDouble(valorSemVirgula);
    }
}
