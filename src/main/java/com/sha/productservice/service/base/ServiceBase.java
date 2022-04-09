package com.sha.productservice.service.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ServiceBase<Model> implements IServiceBase<Model> {

    private final JpaRepository repository;

    public  ServiceBase(JpaRepository repository){
        this.repository = repository;
    }

    @Override
    public Model Save(Model model){
        return (Model)repository.save(model);
    }

    @Override
    public void Delete(Object Id){
        repository.deleteById(Id);
    }

    @Override
    public Model Get(Object Id) {
        return (Model)repository.findById(Id).orElse(null);
    }

    @Override
    public List<Model> GetAll(){
        return repository.findAll();
    }

}
