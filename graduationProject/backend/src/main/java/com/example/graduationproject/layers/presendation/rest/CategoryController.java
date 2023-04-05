package com.example.graduationproject.layers.presendation.rest;

import com.example.graduationproject.layers.business.dto.CategoryDto;
import com.example.graduationproject.layers.business.service.CategoryServiceImpl;
import com.example.graduationproject.layers.data.entity.Category;
import com.example.graduationproject.layers.data.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {
    private CategoryServiceImpl categoryService;
    CategoryController(CategoryServiceImpl categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping()
    public List<CategoryDto> getAll(){
        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable("id") int id){
        return categoryService.findById(id);
    }
}
