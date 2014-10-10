package com.football.reminder.vo;

public class TeamSupport {
    private Long id;

    private String emailId;

    private Integer matchId;

    private Short teamId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId == null ? null : emailId.trim();
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Short getTeamId() {
        return teamId;
    }

    public void setTeamId(Short teamId) {
        this.teamId = teamId;
    }
}