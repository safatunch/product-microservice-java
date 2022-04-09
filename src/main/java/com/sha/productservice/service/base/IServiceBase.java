package com.sha.productservice.service.base;

import java.util.List;

public interface IServiceBase<Model> {
    Model Save(Model model);

    void Delete(Object Id);

    Model Get(Object Id);
    List<Model> GetAll();
}
