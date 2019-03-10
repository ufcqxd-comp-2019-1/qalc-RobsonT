package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (PLUS).
 */
public class PlusToken extends Token{
    /**
     * Valor que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     * @see #interpretAttributes()
     */

    protected char charValue;
    public PlusToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, converte o lexema em um operador do tipo {@code char},
     * caso não tenha feito ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if(stringValue != null){
            charValue = stringValue.charAt(0);
        }
    }

    /**
     * Obtém a representação do lexema deste token interpretada como um char.
     *
     * @return Valor do lexema.
     */
    public char getPlusToken() {
        interpretAttributes();

        return charValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "PLUS";
    }
}
