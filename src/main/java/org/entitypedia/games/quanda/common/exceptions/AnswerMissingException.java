package org.entitypedia.games.quanda.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class AnswerMissingException extends QuandaException {

    public AnswerMissingException(Object... params) {
        super(getFormattedMessage(AnswerMissingException.class.getSimpleName(), params));
        this.params = params;
    }
}