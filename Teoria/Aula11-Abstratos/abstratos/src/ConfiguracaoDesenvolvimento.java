public class ConfiguracaoDesenvolvimento extends Configuracao{

    private String user;

    public ConfiguracaoDesenvolvimento(String bANCO_DE_DADOS_URL, String aPLICACAO_URL) {
        super(bANCO_DE_DADOS_URL, aPLICACAO_URL, true, true);
        setUser("localhost");
    }

    @Override
    public String getUser() {
        return this.user;
    }

    @Override
    protected boolean setUser(String user) {
        if(user.isEmpty())
            return false;
        this.user = user;
        return true;
    }
    
}
