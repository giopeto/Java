package com.websystem.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.websystem.bean.User;
import com.websystem.dao.IDAO;


public abstract class AbstractDAO<T> implements IDAO<T>  {

	private Class<T> domainClass;

	protected transient final Logger logger = Logger.getLogger(AbstractDAO.class);
	
	public AbstractDAO(Class<T> domainClass) {
		this.domainClass = domainClass;
	}
	
	protected HibernateTemplate hibernateTemplate;

	
	@Override
	public void create(T o) {
	    hibernateTemplate.persist(o);
	}
	
	@Override
	public List<T> findAll() {
	    return (List<T>) hibernateTemplate.loadAll(domainClass);
	}
	
	@Override
	public T find(long id) {
	    return (T) hibernateTemplate.get(domainClass, id);
	}
	
	@Override
	public void update(T o) {
	    hibernateTemplate.update(o);
	}
	
	@Override
	public void saveOrUpdate(T o) {
	    hibernateTemplate.saveOrUpdate(o);
	}
	
	@Override
	public T save(T o) {
	    hibernateTemplate.save(o);
	    return o;
	}
	
	@Override
	public void delete(T o) {
	    hibernateTemplate.delete(o);
	}
	
	@Override
    public void deleteAll(List<T> o) {
        hibernateTemplate.deleteAll(o);
    }
	
	@Override
	public T refresh(T o) {
	    hibernateTemplate.refresh(o);
		return o;
	}
	
//	@Override
//    public void flush() {
//        hibernateTemplate.flush();
//    }
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}