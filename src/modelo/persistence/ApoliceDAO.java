package modelo.persistence;

import java.util.List;

import org.hibernate.Session;

import dominio.Apolice;


public class ApoliceDAO {
	
private Session session;
	
	public ApoliceDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar (Apolice apolice){
		session.beginTransaction();
		session.save(apolice);
		session.getTransaction().commit();
		
	}
	/*
	public List<Apolice> todos(){
		return session.createCriteria(Apolice.class).list();
	}
	*/
}
