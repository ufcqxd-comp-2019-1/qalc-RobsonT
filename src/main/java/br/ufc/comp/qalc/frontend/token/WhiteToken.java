package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (WHITE).
 */
public class WhiteToken extends Token {

    public WhiteToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return espaçoes em branco.
     */
    public String getWhiteToken() {
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "WHITE";
    }

}
