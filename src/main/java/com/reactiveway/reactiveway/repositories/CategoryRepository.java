package com.reactiveway.reactiveway.repositories;
import com.reactiveway.reactiveway.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
