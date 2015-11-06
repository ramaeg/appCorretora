package modelo.persistence;

import java.util.List;

import org.hibernate.Session;

import dominio.Automovel;

public class AutomovelDAO {
	private Session session;
	
	public AutomovelDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar(Automovel automovel){
		session.beginTransaction();
		session.save(automovel);
		session.getTransaction().commit();
	}
	/*
	public List<Automovel> todos(){
		return session.createCriteria(Automovel.class).list();
	}
	*/
}
