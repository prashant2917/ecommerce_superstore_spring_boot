package com.ecommerce.superstore.repositories;

import com.ecommerce.superstore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
