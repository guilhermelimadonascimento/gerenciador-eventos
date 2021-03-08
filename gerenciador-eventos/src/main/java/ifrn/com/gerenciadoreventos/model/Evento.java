package ifrn.com.gerenciadoreventos.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ifrn.com.gerenciadoreventos.repository.EventoRepository;

public class Evento {
	private String tema;
	private String data;
	private List<Participante> participantes = new ArrayList<>();
	private List<Atividade> atividades = new ArrayList<>();
	
	public Evento(String tema, String data) {
		super();
		this.tema = tema;
		this.data = data;
		this.participantes = new ArrayList<>();
		this.atividades = new ArrayList<>();
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
}