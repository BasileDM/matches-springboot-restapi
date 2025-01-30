package com.scorestable.restapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    private String teamA;

    @NotNull
    @Size(min = 1, max = 50)
    private String teamB;
    private Integer scoreA;
    private Integer scoreB;

    // No-argument constructor
    public Match() {
    }

    // All-argument constructor (optional, for convenience)
    public Match(String teamA, String teamB, Integer scoreA, Integer scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public Integer getScoreA() {
        return scoreA;
    }

    public void setScoreA(Integer score) {
        this.scoreA = score;
    }

    public Integer getScoreB() {
        return scoreB;
    }

    public void setScoreB(Integer score) {
        this.scoreB = score;
    }
}