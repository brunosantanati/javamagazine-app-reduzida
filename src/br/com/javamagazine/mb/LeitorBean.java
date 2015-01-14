package br.com.javamagazine.mb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.javamagazine.dao.LeitorDao;
import br.com.javamagazine.entidades.Leitor;
import br.com.javamagazine.interceptadores.Transacional;

@Named
@RequestScoped
public class LeitorBean {
	
	//restante da implementação omitida
	
	@Inject
	private LeitorDao leitorDao;
	private List<Leitor> leitores;
	
	@Transacional
	public List<Leitor> getLeitores(){
		if(leitores == null){
			leitores = leitorDao.listarLeitores();
		}
		
		return leitores;
	}
	
	//restante da implementação omitida
}
