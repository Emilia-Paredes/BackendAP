package com.portfolio.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity  

public class Skill implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String skill;
    private int percentage;
    
    public Skill() {
    }
    
    public Skill(String skill, int percentage) {
        this.skill = skill;
        this.percentage = percentage;
    }
}
