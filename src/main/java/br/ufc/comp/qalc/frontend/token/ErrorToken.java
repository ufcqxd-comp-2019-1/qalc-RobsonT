package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um ttoke não identificado (erro).
 */
public class ErrorToken extends Token{
    /**
     * Valor que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     */

    public ErrorToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Obtém a representação do erro.
     *
     * @return trecho do codigo que gerou o erro.
     */
    public String getErrorToken() {
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "Erro: linha " + getLineNumber() + ", Coluna " + getColumnStart() + "-" + getColumnEnd() + "; Descricao:" + getErrorToken();
    }
}
