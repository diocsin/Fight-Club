package com.example.Fight_Club.dto;

import com.example.Fight_Club.model.Fighter;

import java.util.List;

public class FighterResponseDto {

    private List<Fighter> fighters;


    public FighterResponseDto(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    public FighterResponseDto() {
    }

    public List<Fighter> getFighters() {
        return fighters;
    }

    public void setFighters(List<Fighter> fighters) {
        this.fighters = fighters;
    }
}
