package com.api.java.api_products_2826505.repositories;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.api.java.api_products_2826505.entities.Product;

@Service
@Repository
public interface ProductRepository extends CrudRepository <Product , Long>{
//repositorio por cada entidad
    
}
