package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class SkillDto {
    
    @NotBlank
    private String skill;
    private int percentage;
    
    
    public SkillDto() {
    }
    
    public SkillDto(String skill, int percentage) {
        this.skill = skill;
        this.percentage = percentage;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
