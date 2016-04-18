package Bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import DAO.ConvidadoDAO;
import Entidades.Convidado;
import Entidades.Evento;

@ManagedBean(name="ConvidadoBean")
@SessionScoped
public class ConvidadoBean {
	private Convidado convidado = new Convidado();
	private ConvidadoDAO convidadoDAO = new ConvidadoDAO();
	private List<Convidado> lista = new ArrayList();
	private String nomeBuscar;
	private int codigoBuscar;
	private Evento evento = new Evento();
	private boolean x = false;
	

	public String cadastrarConvidado() throws ClassNotFoundException, SQLException{
		boolean z = convidadoDAO.cadastrarConvidado(convidado);
		System.out.println(z);
		if(z==true){
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Convidado já existe!", "Convidado já existe!"));
			return "false";
		}else{
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Convidado cadastrado!", "Convidado cadastrado!"));
			return "/convite.xhtml";
		}
	}
	
	public String passarTela(){
		return "/funcoes.xhtml";
	}
	
	public void verificarAcesso() throws ClassNotFoundException{
		boolean x = convidadoDAO.verificarAcesso(codigoBuscar);
		if(x==true){
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Codigo de acesso existente!", "Codigo de acesso existente!"));
		}else{
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Codigo de acesso inválido!", "Codigo de acesso inválido!"));
		}
	}
	public List<Convidado> getLista() throws ClassNotFoundException{
		this.lista = convidadoDAO.listarConvidados(nomeBuscar, x);
		if(x==false){
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nome não encontrado!", "Nome não encontrado!"));
		}
		return lista;

	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public String getNomeBuscar() {
		return nomeBuscar;
	}

	public void setNomeBuscar(String nomeBuscar) {
		this.nomeBuscar = nomeBuscar;
	}

	public int getCodigoBuscar() {
		return codigoBuscar;
	}

	public void setCodigoBuscar(int codigoBuscar) {
		this.codigoBuscar = codigoBuscar;
	}



	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}
}
