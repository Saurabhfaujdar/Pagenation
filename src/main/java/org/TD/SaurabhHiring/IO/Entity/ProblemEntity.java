package org.TD.SaurabhHiring.IO.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name="Problems")
public class ProblemEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String problemName;
    private String authorName;
    private String problemContent;
    private String topic;
    private String href;
    private String problemId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }
}
