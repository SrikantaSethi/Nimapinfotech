package com.nimap.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nimap.RequestDTO.CategoryRequest;
import com.nimap.RequestDTO.UpdateCategoryRequest;
import com.nimap.custommodels.CategoryDetails;
import com.nimap.entity.Category;
import com.nimap.entity.Product;
@Service
public interface OrderService {
	
	public String save(CategoryRequest categoryRequest);

	public Page<CategoryDetails> fetchCategoryDetails(String productDetails, Pageable pageable);

	public String update(UpdateCategoryRequest categoryRequest);

	public List<Category> findAllCategory();

	public List<Product> findAllProducts();

	public boolean deleteByid(Long id);

	public Category findByCategoryId(Long id);

	public Product findByProductId(Long id);
	
	public void deleteByProductId(Long id) ;

}
