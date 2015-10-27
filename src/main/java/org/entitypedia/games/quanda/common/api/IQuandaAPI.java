package org.entitypedia.games.quanda.common.api;

import org.entitypedia.games.quanda.common.exceptions.AnswerMissingException;
import org.entitypedia.games.quanda.common.exceptions.NoMoreQuestionsException;
import org.entitypedia.games.quanda.common.exceptions.QuestionAlreadyAnsweredException;
import org.entitypedia.games.quanda.common.exceptions.QuestionNotFoundException;
import org.entitypedia.games.quanda.common.model.Question;

/**
 * Quanda API.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path quanda
 */
public interface IQuandaAPI {

    String GET_QUESTION = "question";
    String POST_ANSWER = "answer";

    /**
     * Gets next question.
     * <p>
     * Throws {@link NoMoreQuestionsException} if questions are exhausted.
     *
     * @param changeTopic if topic needs to be changed from the topic of the last question
     * @return question
     */
    Question getQuestion(Boolean changeTopic);

    /**
     * Posts answer.
     * <p>
     * Throws {@link QuestionNotFoundException} if question is not found.<br>
     * Throws {@link QuestionAlreadyAnsweredException} if question is already answered.<br>
     * Throws {@link AnswerMissingException} if answer is missing or empty.<br>
     *
     * @param questionId id of the question being answered
     * @param answer     answer text
     * @return true if the answer was correct, false if not
     */
    boolean postAnswer(long questionId, String answer);
}