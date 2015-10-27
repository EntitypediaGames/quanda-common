package org.entitypedia.games.quanda.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class QuestionNotFoundException extends QuandaException {

    public QuestionNotFoundException(Object... params) {
        super(getFormattedMessage(QuestionNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}