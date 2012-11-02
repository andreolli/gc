package br.com.mackenzie.gc.modelo;

import java.util.Calendar;


public class Experiencia {
	private int idExperiencia ;
	private String empresa;
	private String segmento ;
	private String porte;
	private Calendar dataInicio;
	private Calendar dataFim;
	private String area;
	private String ultimoCargo;
	private String atividade;
	private String nivel;
	private int idCandidato;
	public int getIdExperiencia() {
		return idExperiencia;
	}
	public void setIdExperiencia(int idExperiencia) {
		this.idExperiencia = idExperiencia;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUltimoCargo() {
		return ultimoCargo;
	}
	public void setUltimoCargo(String ultimoCargo) {
		this.ultimoCargo = ultimoCargo;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	
	
}
