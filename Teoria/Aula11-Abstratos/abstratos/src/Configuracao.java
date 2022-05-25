public abstract class Configuracao {
    public final String BANCO_DE_DADOS_URL; 
    public final String APLICACAO_URL;
    public final boolean DEBUG;
    public final boolean LOG;

    public Configuracao(String bANCO_DE_DADOS_URL, String aPLICACAO_URL, boolean dEBUG, boolean lOG) {
        BANCO_DE_DADOS_URL = bANCO_DE_DADOS_URL;
        APLICACAO_URL = aPLICACAO_URL;
        DEBUG = dEBUG;
        LOG = lOG;
    }

    public abstract String getUser();
    protected abstract boolean setUser(String user);

    @Override
    public String toString() {
        return "Configuracao [APLICACAO_URL=" + APLICACAO_URL + ", BANCO_DE_DADOS_URL=" + BANCO_DE_DADOS_URL
                + ", DEBUG=" + DEBUG + ", LOG=" + LOG + "]";
    }

    
}
