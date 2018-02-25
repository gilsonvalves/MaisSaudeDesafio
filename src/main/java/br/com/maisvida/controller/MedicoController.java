package br.com.maisvida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.maisvida.model.Medico;
import br.com.maisvida.repository.MedicoRepository;

@Controller
public class MedicoController {
	
	@Autowired
	private MedicoRepository er;
	
	@RequestMapping(value="/cadastramento", method=RequestMethod.GET)
	public String cadastro() {
		
		return "formulario";
	}
	@RequestMapping(value="/cadastramento", method=RequestMethod.POST)
	public String cadastro(Medico medico) {
		
		er.save(medico);
		return "redirect:/cadastramento";
	}
	
}
