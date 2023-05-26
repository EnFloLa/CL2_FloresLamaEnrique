package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Personal;
import com.example.demo.services.PersonalServiceImpl;

@Controller
@RequestMapping("/lista")
public class IndexController {

	@Autowired
	private PersonalServiceImpl personalService;
	
	@Value("${index.titulo.text}")
	private String title;
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", title);
		return "index";
	}
	
	@ModelAttribute("personales")
	public List<Personal> obtenerPersonales(){
		List<Personal> personales = personalService.getAllPersonal();
		
		return personales;
	}
}
