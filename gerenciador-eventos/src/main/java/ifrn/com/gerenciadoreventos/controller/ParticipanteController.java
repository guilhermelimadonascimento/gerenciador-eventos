package ifrn.com.gerenciadoreventos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.com.gerenciadoreventos.model.Participante;
import ifrn.com.gerenciadoreventos.model.Evento;
import ifrn.com.gerenciadoreventos.repository.EventoRepository;

@Controller
public class ParticipanteController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping("/participante/inscrever/{tema}")
	public String newParticipante(@PathVariable("tema") String tema, Model model) {
 		model.addAttribute("evento", eventoRepository.getEventoByTema(tema));
		model.addAttribute("participante", new Participante());
		return "/new-participante";
	}
	
	@GetMapping("/participante/show/{tema}")
	public String showParticipante(@PathVariable("tema") String tema, Model model) {
 		model.addAttribute("evento", eventoRepository.getEventoByTema(tema));
		return "/show-evento";
	}
	
	
	@PostMapping("/participante/{tema}")
	public String saveParticipante(@PathVariable("tema") String tema, @ModelAttribute Participante participante, @ModelAttribute Evento evento) {
		eventoRepository.getEventoByTema(tema).getParticipantes().add(participante);
		return "redirect:/";
	}
	
	@GetMapping("/criar")
	public String criarUsuarios(HttpSession session, Model model){
		return "redirect:/";
	}

}
