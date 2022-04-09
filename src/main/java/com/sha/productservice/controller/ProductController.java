package com.sha.productservice.controller;

import com.sha.productservice.model.Product;
import com.sha.productservice.service.IProductService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    private final IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> Save(@RequestBody Product product){
        return new ResponseEntity<>(service.Save(product), HttpStatus.CREATED);
    }

    @GetMapping("{Id}")
    public  ResponseEntity<?> Get(@PathVariable long Id){
        Product res = service.Get(Id);
        if(res == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping
    public  String Test(){
        return  ":D";
    }

    @GetMapping
    public  ResponseEntity<?> Get(){
        return  new ResponseEntity<>(service.GetAll(), HttpStatus.OK);
    }
}
