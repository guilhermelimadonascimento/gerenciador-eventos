package ifrn.com.gerenciadoreventos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ifrn.com.gerenciadoreventos.model.Atividade;
import ifrn.com.gerenciadoreventos.model.Evento;

@Repository
public class EventoRepository {
	private List<Evento> eventos = new ArrayList<>();
	
	public EventoRepository() {
		super();
		
		Evento objeto1 = new Evento("Semana da Tecnologia e sustentabilidade", "02/04/2021");
		Evento objeto2 = new Evento("Semana de Ciência, Tecnologia e Extensão", "10/08/2021");
		
		this.eventos.add(objeto1);
		this.eventos.add(objeto2);
	}
	
	public Evento getEventoByTema(String tema) {
		for( Evento evento : this.eventos) {
			if (evento.getTema().equalsIgnoreCase(tema)) {
				return evento;
			}
		}	
		return null;
	}
	
	public void criarEvento(Evento objeto) {
		this.eventos.add(objeto);
	}

	public List<Evento> getAllEventos() {
		return this.eventos;
	}
}
