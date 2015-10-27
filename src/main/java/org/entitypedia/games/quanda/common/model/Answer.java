package org.entitypedia.games.quanda.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Quanda answer.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Answer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Question question;

    private String answer;

    private Date answerTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }
}