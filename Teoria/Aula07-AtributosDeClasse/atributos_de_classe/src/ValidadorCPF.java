
import java.util.ArrayList;
import java.util.List;

public class ValidadorCPF {
    private static List<String> cpfInvalido = new ArrayList<String>(){{add("11111111111"); add("22222222222"); add("33333333333"); add("44444444444"); add("55555555555"); add("66666666666"); add("77777777777"); add("88888888888"); add("99999999999"); add("00000000000");}};

    public static boolean validar(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");     

        if(cpf.length() != 11)
            return false;

        if (cpfInvalido.contains(cpf))
            return false;

        int soma = Integer.parseInt("" + cpf.charAt(0)) * 10;
        for(int i = 1; i < 9; i++)
            soma += Integer.parseInt("" + cpf.charAt(i)) * (10 - i);

        soma = (soma * 10) % 11;
        if (soma != Integer.parseInt("" + cpf.charAt(9)))
            return false;

        soma = Integer.parseInt("" + cpf.charAt(0)) * 11;
        for(int i = 1; i < 10; i++)
            soma += Integer.parseInt("" + cpf.charAt(i)) * (11 - i);
        soma = (soma * 10) % 11;
        if (soma != Integer.parseInt("" + cpf.charAt(10)))
            return false;

        return true;
    }
}
