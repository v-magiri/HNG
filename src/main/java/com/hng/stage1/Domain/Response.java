package com.hng.stage1.Domain;

public class Response {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private int status_code;
    private String github_file_url;
    private String github_repo_url;

    public Response(String slackName, String currentDay, String currentUTCTime,
                    String track,String githubFileUrl,
                    String githubRepoUrl, int statusCode) {
        this.slack_name = slackName;
        this.current_day = currentDay;
        this.utc_time = currentUTCTime;
        this.track = track;
        this.github_file_url = githubFileUrl;
        this.github_repo_url = githubRepoUrl;
        this.status_code = statusCode;
    }

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getCurrent_day() {
        return current_day;
    }

    public void setCurrent_day(String current_day) {
        this.current_day = current_day;
    }

    public String getUtc_time() {
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getGithub_file_url() {
        return github_file_url;
    }

    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }
}
