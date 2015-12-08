package com.cavassani.inventory.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory = criarFabricaDeSessoes();
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static SessionFactory criarFabricaDeSessoes(){
		try{
			
			Configuration configuracao = new Configuration().configure();
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica;
		} catch (Throwable ex) {
            
            System.err.println("A fábrica de Sessões não pode ser criada." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}

}

