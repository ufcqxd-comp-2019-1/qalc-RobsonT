package br.ufc.comp.qalc.report;

import br.ufc.comp.qalc.OutputVerbosity;
import br.ufc.comp.qalc.report.messages.Message;
import br.ufc.comp.qalc.report.messages.MessageCategory;
import br.ufc.comp.qalc.report.messages.NewTokenMessage;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Classe especializada no relato de mensagens de erro.
 *
 * @see MessageCategory#ERROR
 */
public class ErrorReporter extends BasicReporter {
    /**
     * @see BasicReporter#BasicReporter(OutputStream)
     */
    public ErrorReporter(OutputStream stream) {
        super(stream);
    }

    /**
     * @see BasicReporter#BasicReporter(OutputStream, OutputVerbosity)
     */
    public ErrorReporter(OutputStream stream, OutputVerbosity verbosity) {
        super(stream, verbosity);
    }

    @Override
    public void consume(Message message) {
        if (message instanceof NewTokenMessage) {
            try {
                output.write(String.format("%s, %s, L: %d, C: %d-%d)\n",
                        ((NewTokenMessage) message).getToken().getTokenIdentifier(),
                        ((NewTokenMessage) message).getToken().toString(),
                        ((NewTokenMessage) message).getToken().getLineNumber(),
                        ((NewTokenMessage) message).getToken().getColumnStart(),
                        ((NewTokenMessage) message).getToken().getColumnEnd()));

            } catch (IOException e) {
                reportFailure(e);
            }
        }
    }
}
