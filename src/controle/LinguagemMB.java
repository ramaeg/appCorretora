package controle;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


@ManagedBean(name="lang")
@SessionScoped
public class LinguagemMB {
	
	private Map<String, Locale>idiomas;
	
	public LinguagemMB(){
		idiomas = new HashMap<String, Locale>(); 
		idiomas.put("Portugu�s", new Locale("pt", "BR"));
		idiomas.put("Fran�ais", Locale.FRANCE);
		idiomas.put("Finland", new Locale("fi","FI"));
		
	}
	//M�todo que troca idioma da p�gina inteira
	public void mudaIdioma(ValueChangeEvent e){
		String idSelect = e.getNewValue().toString();
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(idSelect));
	}
	
	public Map<String, Locale> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Map<String, Locale> idiomas) {
		this.idiomas = idiomas;
	}
	
	
}
