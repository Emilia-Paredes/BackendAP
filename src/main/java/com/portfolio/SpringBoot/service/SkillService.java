package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Skill;
import com.portfolio.SpringBoot.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService {
    
    @Autowired
    public SkillRepository skillRepo;
    
    public List<Skill> list(){
        return skillRepo.findAll();
    }
    
    public Optional<Skill> getOne(int id){
        return skillRepo.findById(id);
    }
    
    public Optional<Skill> getByNombre(String skill){
        return skillRepo.findBySkill(skill);
    }
    
    public void save(Skill skill){
        skillRepo.save(skill);
    }
    
    public void delete(int id){
        skillRepo.deleteById(id);
    }
    
    public boolean existsById(int id){
        return skillRepo.existsById(id);
    }
    
    public boolean existsByNombre(String nombreSkill){
        return skillRepo.existsBySkill(nombreSkill);
    }
}
