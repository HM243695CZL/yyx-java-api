package com.hl.project.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@SuppressWarnings("all")
public abstract class AbstractService<T>  implements Service<T>{

    @Autowired
    protected Mapper<T> mapper;

    private Class<T> modelClass; // 当前泛型真实类型的Class

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    public void create(T model) {
        mapper.insertSelective(model);
    }


    @Override
    public void delete(String id) {
        mapper.deleteByPrimaryKey(id);
    }


    @Override
    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public T view(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> list() {
        return mapper.selectAll();
    }
}
