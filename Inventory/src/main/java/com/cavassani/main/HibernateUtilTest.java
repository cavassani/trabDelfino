package com.cavassani.main;

import org.hibernate.Session;

import com.cavassani.inventory.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String [] args) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.close();
		HibernateUtil.getSessionFactory().close();
	}

}
