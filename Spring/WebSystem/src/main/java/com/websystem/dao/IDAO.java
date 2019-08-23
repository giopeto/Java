package com.websystem.dao;

import java.util.List;

import com.websystem.bean.User;


public interface IDAO<T> {
    
    void create(T o);
    
    T find(long id);
    
    List<T> findAll();
    
    void update(T o);
    
    void saveOrUpdate(T o);
    
    T save(T o);
    
    void delete(T o);
    
    T refresh(T o);

    void deleteAll(List<T> o);

//    void flush();
}