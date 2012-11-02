package br.com.mackenzie.gc.modelo;

import java.util.Calendar;

public class Formacao {

	private int idFormacao;
	private String nivel;
	private String curso;
	private String instituicao;
	private String pais;
	private String estado;
	private String cidade;
	private String classificacaoCurso;
	private int duracaoTotal;
	private String situacaoAtual;
	private Calendar dataInicio;
	private Calendar dataFim;
	private boolean concluido;
	private int idCandidato;
	public int getIdFormacao() {
		return idFormacao;
	}
	public void setIdFormacao(int idFormacao) {
		this.idFormacao = idFormacao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getClassificacaoCurso() {
		return classificacaoCurso;
	}
	public void setClassificacaoCurso(String classificacaoCurso) {
		this.classificacaoCurso = classificacaoCurso;
	}
	public int getDuracaoTotal() {
		return duracaoTotal;
	}
	public void setDuracaoTotal(int duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}
	public String getSituacaoAtual() {
		return situacaoAtual;
	}
	public void setSituacaoAtual(String situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
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
	public boolean isConcluido() {
		return concluido;
	}
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	
	

}
