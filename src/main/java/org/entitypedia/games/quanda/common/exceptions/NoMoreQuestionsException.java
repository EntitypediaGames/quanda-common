package org.entitypedia.games.quanda.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class NoMoreQuestionsException extends QuandaException {

    public NoMoreQuestionsException(Object... params) {
        super(getFormattedMessage(NoMoreQuestionsException.class.getSimpleName(), params));
        this.params = params;
    }
}