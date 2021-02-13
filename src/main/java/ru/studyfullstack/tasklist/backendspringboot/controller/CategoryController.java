package ru.studyfullstack.tasklist.backendspringboot.controller;

import org.springframework.web.bind.annotation.*;
import ru.studyfullstack.tasklist.backendspringboot.entity.CategoryEntity;
import ru.studyfullstack.tasklist.backendspringboot.repo.CategoryRepository;

import java.util.List;

@RestController//json
@RequestMapping("/category")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/test")
    public List<CategoryEntity> test(){
        List <CategoryEntity> list = categoryRepository.findAll();
        System.out.println(list);
        return list;
    }

    @PostMapping("/add")
    public CategoryEntity add(@RequestBody CategoryEntity categoryEntity){
        return categoryRepository.save(categoryEntity); // add data to database and send obj in json format in response
    }
}
