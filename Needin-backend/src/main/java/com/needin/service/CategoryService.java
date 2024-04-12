package com.needin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needin.repository.CategoryRepository;

@Service
public class CategoryService {
	
	
	
	    
	    private final CategoryRepository categoryRepository;

	    @Autowired
	    public CategoryService(CategoryRepository categoryRepository) {
	        this.categoryRepository = categoryRepository;
	    }

}
