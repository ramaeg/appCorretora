package controle;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.persistence.ApoliceDAO;
import modelo.persistence.AutomovelDAO;
import modelo.persistence.PessoaDAO;
import dominio.Apolice;
import dominio.Automovel;
import dominio.Pessoa;


@ManagedBean(name="metodoMB")
@RequestScoped
public class metodoMB {
	
	private Automovel automovel = new Automovel();
	private AutomovelDAO dao = new AutomovelDAO();
	
	private List<Automovel> automoveis;
	
	private Pessoa pessoa = new Pessoa();
	private PessoaDAO daoP = new PessoaDAO();
	
	private List<Pessoa> pessoas;
	
	private Apolice apolice = new Apolice();
	private ApoliceDAO daoA = new ApoliceDAO();
	
	private List<Apolice> apolices;
	
	public String cadastrar(){
		dao.salvar(automovel);
		daoP.salvar(pessoa);
		daoA.salvar(apolice);
		
		return "index";
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public AutomovelDAO getDao() {
		return dao;
	}

	public void setDao(AutomovelDAO dao) {
		this.dao = dao;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaDAO getDaoP() {
		return daoP;
	}

	public void setDaoP(PessoaDAO daoP) {
		this.daoP = daoP;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}

	public ApoliceDAO getDaoA() {
		return daoA;
	}

	public void setDaoA(ApoliceDAO daoA) {
		this.daoA = daoA;
	}

	public List<Apolice> getApolices() {
		return apolices;
	}

	public void setApolices(List<Apolice> apolices) {
		this.apolices = apolices;
	}
	
}
