package com.sha.productservice.service;

import com.sha.productservice.model.Product;
import com.sha.productservice.repository.IProductRepository;
import com.sha.productservice.service.base.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends ServiceBase<Product> implements IProductService {

    public ProductService(@Autowired IProductRepository repository) {
        super(repository);
    }
}
