package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity 
public class Pessoa implements  Serializable{
	@Id @GeneratedValue
	private Integer id; 
	
	private String nome;
	private String endereco;
	private String cpf;
	private Date nascimento;
	private Integer rg;
	private String estadoCivil;
	private String telefone;
		
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String endereco, String cpf, Date nascimento,
			Integer rg, String estadoCivil, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.rg = rg;
		this.estadoCivil = estadoCivil;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public String isEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivl(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
