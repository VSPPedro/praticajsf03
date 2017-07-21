package br.edu.ifpb.pweb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.pweb.turmas.dao.TurmaDAO;
import br.edu.ifpb.pweb.turmas.model.Turma;

@ManagedBean(name = "turmasBean")
@RequestScoped
public class TurmasBean {
	private List<Turma> turmas = new ArrayList<Turma>();

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public void listar(){
		TurmaDAO dao = new TurmaDAO();
		
		this.turmas = dao.findAll();
	}
}
