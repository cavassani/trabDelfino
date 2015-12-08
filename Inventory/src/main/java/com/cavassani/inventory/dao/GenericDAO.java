package com.cavassani.inventory.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cavassani.inventory.util.HibernateUtil;

public class GenericDAO<Entity> {
	private Class<Entity> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAO(){
		this.classe = (Class<Entity>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	public void salvar(Entity entity){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao= sessao.beginTransaction();
			sessao.save(entity);
			transacao.commit();
			
		} catch (RuntimeException error) {
			if (transacao != null) transacao.rollback();
			throw error;
		}finally {
			sessao.close();	
		}
	}
	
    @SuppressWarnings("unchecked")
	public  List<Entity> listar(){
    	Session sessao = HibernateUtil.getSessionFactory().openSession();
    	try{
    		Criteria consult = sessao.createCriteria(classe);
    		List<Entity> result = consult.list();
    		return result;
    		
    	}catch (RuntimeException error) {
    		throw error;
    	}finally{
    		sessao.close();
    	}
    }
    @SuppressWarnings("unchecked")
	public Entity buscar(Long code){
    	Session sessao = HibernateUtil.getSessionFactory().openSession();
    	try{
    		Criteria consult = sessao.createCriteria(classe);
    		consult.add(Restrictions.idEq(code));
    	    Entity result = (Entity) consult.uniqueResult();
    		return result;
    		
    	}catch (RuntimeException error) {
    		throw error;
    	}finally{
    		sessao.close();
    	}
    }
    public void excluir(Entity entity){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao= sessao.beginTransaction();
			sessao.delete(entity);
			transacao.commit();
			
		} catch (RuntimeException error) {
			if (transacao != null) transacao.rollback();
			throw error;
		}finally {
			sessao.close();	
		}
	}
    
    public void editar(Entity entity){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao= sessao.beginTransaction();
			sessao.update(entity);
			transacao.commit();
			
		} catch (RuntimeException error) {
			if (transacao != null) transacao.rollback();
			throw error;
		}finally {
			sessao.close();	
		}
	}
    
    
   

}
