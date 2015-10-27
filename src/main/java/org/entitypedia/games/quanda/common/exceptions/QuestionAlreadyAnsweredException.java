package org.entitypedia.games.quanda.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 409)
public class QuestionAlreadyAnsweredException extends QuandaException {

    public QuestionAlreadyAnsweredException(Object... params) {
        super(getFormattedMessage(QuestionAlreadyAnsweredException.class.getSimpleName(), params));
        this.params = params;
    }
}