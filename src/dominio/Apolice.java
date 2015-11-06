package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity 
public class Apolice implements Serializable{
	@Id @GeneratedValue
	private Integer id;
	private Integer numero; 
	private Integer bonus;
	private Date vigenciaInial;
	private Date vigenciaFinal;
	private double premioLiquido;
	//private Financeiro comissao;
	private String seguradora;
	
	public Apolice(){
		
	}
	
	public Apolice(Integer numero, Integer bonus, Date vigenciaInial,Date vigenciaFinal,double premioLiquido, /*Financeiro comissao,*/ String seguradora) {
		this.numero = numero;
		this.bonus = bonus;
		this.vigenciaInial = vigenciaInial;
		this.vigenciaFinal = vigenciaFinal;
		this.premioLiquido = premioLiquido;
		//this.comissao = comissao;
		this.seguradora = seguradora;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getBonus() {
		return bonus;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	public Date getVigenciaInial() {
		return vigenciaInial;
	}
	public void setVigenciaInial(Date vigenciaInial) {
		this.vigenciaInial = vigenciaInial;
	}	
	public Date getVigenciaFinal() {
		return vigenciaFinal;
	}
	public void setVigenciaFinal(Date vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}	
	public double getPremioLiquido() {
		return premioLiquido;
	}
	public void setPremioLiquido(double premioLiquido) {
		this.premioLiquido = premioLiquido;
	}
	/*public Financeiro getComissao() {
		return comissao;
	}
	public void setComissao(Financeiro comissao) {
		this.comissao = comissao;
	}*/
	public String getSeguradora() {
		return seguradora;
	}
	public void setSeguradora(String seguradora) {
		this.seguradora = seguradora;
	}
	
	
	
}
