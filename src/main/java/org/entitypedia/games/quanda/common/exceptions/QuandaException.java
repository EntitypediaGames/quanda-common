package org.entitypedia.games.quanda.common.exceptions;

import org.entitypedia.games.common.exceptions.GameException;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Quanda root exception.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class QuandaException extends GameException {

    private static final ResourceBundle messages = ResourceBundle.getBundle("quanda-exceptions", Locale.getDefault());

    /**
     * Constructor.
     * Creates a new Exception by using super(msg) method.
     *
     * @param errorDescription the description of the error
     */
    public QuandaException(String errorDescription) {
        super(errorDescription);
    }

    /**
     * Constructor.
     * Creates a new Exception by using super(msg, cause) method.
     *
     * @param errorDescription the description of the error
     * @param cause            the cause
     */
    public QuandaException(String errorDescription, Throwable cause) {
        super(errorDescription, cause);
    }

    protected static String getFormattedMessage(String messageKey, Object[] params) {
        return MessageFormat.format(messages.getString(messageKey), params);
    }
}