package ru.studyfullstack.tasklist.backendspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.studyfullstack.tasklist.backendspringboot.entity.PriorityEntity;
import ru.studyfullstack.tasklist.backendspringboot.repo.PriorityRepository;

import java.util.List;

@RestController//rest-query(json)
@RequestMapping("/priority")
public class PriorityController {

    private PriorityRepository priorityRepository;

    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @GetMapping("/test")
    public List <PriorityEntity> test(){
        List<PriorityEntity> list = priorityRepository.findAll();
        System.out.println(list);
        return list;
    }

}
