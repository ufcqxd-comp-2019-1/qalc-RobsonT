package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (TIMES).
 */
public class TimesToken extends Token{
    /**
     * Valor que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     * @see #interpretAttributes()
     */

    public TimesToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, converte o lexema em um operador do tipo {@code String},
     * caso não tenha feito ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if (stringValue != null){
            stringValue = "*";
        }
    }

    /**
     * Obtém a representação do lexema deste token interpretada como uma String.
     *
     * @return Valor numérico do lexema.
     */
    public String getNumericValue() {
        interpretAttributes();

        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "TIMES";
    }
}
