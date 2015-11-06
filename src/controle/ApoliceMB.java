package controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.persistence.ApoliceDAO;
import modelo.persistence.AutomovelDAO;
import modelo.persistence.PessoaDAO;
import dominio.Apolice;
import dominio.Automovel;
import dominio.Pessoa;

@ManagedBean(name="apoliceMB")
@RequestScoped

public class ApoliceMB {
	
	private Apolice apolice = new Apolice();
	private ApoliceDAO dao = new ApoliceDAO();
	
	private List<Apolice> apolices;
	
	private Pessoa pessoa = new Pessoa();
	private PessoaDAO daoPessoa = new PessoaDAO();
	
	private List<Pessoa> pessoas;
	private List<String> estadoCivil;
	/*
	public List<Pessoa> getPessoas() {
		pessoas = daoPessoa.todos();
		return pessoas;
	}*/
	
	private Automovel automovel = new Automovel();
	private AutomovelDAO daoAuto = new AutomovelDAO();
	
	private List<Automovel> automoveis;
	
	public ApoliceMB(){
		/*
		estadoCivil = new ArrayList<String>();
		estadoCivil.add("Solteiro(a)");
		estadoCivil.add("Casado(a) / União Estável");
		estadoCivil.add("Separado(a)");
		estadoCivil.add("Divorciado(a)");
		*/
	}
	
	public String cadastrar(){
		dao.salvar(apolice);
		daoPessoa.salvar(pessoa);
		daoAuto.salvar(automovel);
		
		return "index";
	}
	public String voltar(){	
		return "index";
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}

	public ApoliceDAO getDao() {
		return dao;
	}

	public void setDao(ApoliceDAO dao) {
		this.dao = dao;
	}

	public List<Apolice> getApolices() {
		return apolices;
	}

	public void setApolices(List<Apolice> apolices) {
		this.apolices = apolices;
	}
	
	private String estadoCivilSelecionado;

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<String> getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(List<String> estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivilSelecionado() {
		return estadoCivilSelecionado;
	}

	public void setEstadoCivilSelecionado(String estadoCivilSelecionado) {
		this.estadoCivilSelecionado = estadoCivilSelecionado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaDAO getDaoPessoa() {
		return daoPessoa;
	}

	public void setDaoPessoa(PessoaDAO daoPessoa) {
		this.daoPessoa = daoPessoa;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public AutomovelDAO getDaoAuto() {
		return daoAuto;
	}

	public void setDaoAuto(AutomovelDAO daoAuto) {
		this.daoAuto = daoAuto;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	
	
	
	
}
