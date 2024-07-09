package com.domain.crudApi.models.repos;

import com.domain.crudApi.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//crudotomatis (CrudRepository) dari Spring boot JPA
public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);

}
