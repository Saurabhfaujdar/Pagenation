package org.TD.SaurabhHiring.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateProblemRequestModel {

    private String problemName;
    private String authorName;
    private String problemContent;
    private String topic;

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
}
