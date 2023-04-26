package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 @Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
    public Optional<Skill> findByNombreSkill(String nombreEdu);
    public boolean existsByNombrekill(String nombreEdu);
}
