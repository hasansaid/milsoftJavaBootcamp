package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CategoryDto;
import com.example.graduationproject.layers.core.utilities.mappers.ModelMapperServiceImpl;
import com.example.graduationproject.layers.data.entity.Category;
import com.example.graduationproject.layers.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;
    private ModelMapperServiceImpl modelMapperService;
    @Autowired
    public  CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapperServiceImpl modelMapperService){
        this.categoryRepository=categoryRepository;
        this.modelMapperService=modelMapperService;
    }
    @Override
    public List<CategoryDto> getAll() {
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        List<CategoryDto> brandsResponse = categories.stream().map(
                brand -> this.modelMapperService.forResponse().map(brand,CategoryDto.class)
        ).collect(Collectors.toList());
        return brandsResponse;
    }

    public CategoryDto findById(int id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            return modelMapperService.forResponse().map(category, CategoryDto.class);
        }
        return null;
    }
}
