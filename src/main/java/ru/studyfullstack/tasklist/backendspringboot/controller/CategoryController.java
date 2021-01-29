package ru.studyfullstack.tasklist.backendspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
