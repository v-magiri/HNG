package com.hng.stage1.Domain;

public class Response {
    private String slackName;
    private String currentDay;
    private String currentUTCTime;
    private String track;
    private int statusCode;
    private String githubFileUrl;
    private String githubRepoUrl;

    public Response(String slackName, String currentDay, String currentUTCTime,
                    String track,String githubFileUrl,
                    String githubRepoUrl, int statusCode) {
        this.slackName = slackName;
        this.currentDay = currentDay;
        this.currentUTCTime = currentUTCTime;
        this.track = track;
        this.githubFileUrl = githubFileUrl;
        this.githubRepoUrl = githubRepoUrl;
        this.statusCode = statusCode;

    }

    public String getSlackName() {
        return slackName;
    }

    public void setSlackName(String slackName) {
        this.slackName = slackName;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public String getCurrentUTCTime() {
        return currentUTCTime;
    }

    public void setCurrentUTCTime(String currentUTCTime) {
        this.currentUTCTime = currentUTCTime;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getGithubFileUrl() {
        return githubFileUrl;
    }

    public void setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
    }

    public String getGithubRepoUrl() {
        return githubRepoUrl;
    }

    public void setGithubRepoUrl(String githubRepoUrl) {
        this.githubRepoUrl = githubRepoUrl;
    }
}
