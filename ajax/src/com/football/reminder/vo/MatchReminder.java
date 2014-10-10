package com.football.reminder.vo;

import java.util.Date;

public class MatchReminder {
    private Long id;

    private String emailId;

    private Integer matchId;

    private Date reminderTime;

    private Short reminderType;

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

    public Date getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Date reminderTime) {
        this.reminderTime = reminderTime;
    }

    public Short getReminderType() {
        return reminderType;
    }

    public void setReminderType(Short reminderType) {
        this.reminderType = reminderType;
    }
}