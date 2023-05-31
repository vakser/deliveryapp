package com.example.deliveryapp.repository;

import com.example.deliveryapp.entity.BookStoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="bookCateogry", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookStoreCategory, Long>{

}
