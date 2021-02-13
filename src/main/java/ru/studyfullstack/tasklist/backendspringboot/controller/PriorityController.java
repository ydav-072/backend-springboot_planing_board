package ru.studyfullstack.tasklist.backendspringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody PriorityEntity priorityEntity){
        //проверка на обязательные параметры
        //id must be unique
        if(priorityEntity.getId() != null && priorityEntity.getId() !=0){
            return new ResponseEntity("parametr id is must be null", HttpStatus.NOT_ACCEPTABLE);
        }
        //if title is null
        if(priorityEntity.getTitle() == null || priorityEntity.getTitle().trim().length() == 0 ){
            return new ResponseEntity("parametr title is must be not null", HttpStatus.NOT_ACCEPTABLE);
        }
        return ResponseEntity.ok(priorityRepository.save(priorityEntity));
    }

}
