package ifrn.com.gerenciadoreventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ifrn.com.gerenciadoreventos.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping("/evento")
	public String listEventos(Model model) {	
		model.addAttribute("eventos", eventoRepository.getAllEventos());
		return "/list-eventos";
	}
}
