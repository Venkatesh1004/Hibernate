package com.easylearnjava.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtillDemo {

	public Session getSession() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");

		ServiceRegistryBuilder srb = new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		SessionFactory sf = cfg.buildSessionFactory(srb.buildServiceRegistry());

		return sf.openSession();
	}

}
