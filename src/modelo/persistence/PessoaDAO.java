package modelo.persistence;

import java.util.List;

import org.hibernate.Session;

import dominio.Pessoa;

public class PessoaDAO {
	
	private Session session;
	
	public PessoaDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar (Pessoa pessoa){
		session = HibernateUtil.openSession();
		session.beginTransaction();
		session.save(pessoa);
		session.getTransaction().commit();
		
	}
	/*
	public List<Pessoa> todos(){
		return session.createCriteria(Pessoa.class).list();
	}
	*/
}
