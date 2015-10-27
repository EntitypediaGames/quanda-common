package org.entitypedia.games.quanda.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

/**
 * Quanda question.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonIgnore
    private Long clueId;

    private transient String content;

    @JsonIgnore
    private Long templateId;

    @JsonIgnore
    private QuandaUser user;

    @JsonIgnore
    private Date creationTime;

    @JsonIgnore
    private String answer;

    private Integer wordDifficulty;

    private Integer clueDifficulty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClueId() {
        return clueId;
    }

    public void setClueId(Long clueId) {
        this.clueId = clueId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public QuandaUser getUser() {
        return user;
    }

    public void setUser(QuandaUser user) {
        this.user = user;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getWordDifficulty() {
        return wordDifficulty;
    }

    public void setWordDifficulty(Integer wordDifficulty) {
        this.wordDifficulty = wordDifficulty;
    }

    public Integer getClueDifficulty() {
        return clueDifficulty;
    }

    public void setClueDifficulty(Integer clueDifficulty) {
        this.clueDifficulty = clueDifficulty;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String context) {
        this.content = context;
    }

    /**
     * Returns answer length.
     * @return answer length
     */
    public int getAnswerLength() {
        if (null != answer) {
            return answer.length();
        } else {
            return -1;
        }
    }
}