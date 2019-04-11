package com.techendear.formtest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.techendear.formtest.commands.FormCommand;
import com.techendear.formtest.domains.Form;
import com.techendear.formtest.services.FormServiceImpl;

@Controller
public class FormController {

	@Autowired
	private FormServiceImpl formServiceImpl;

	@GetMapping("/test")
	public String test() {
		return "Hello";
	}

	@GetMapping("/show/{id}")
	public Optional<Form> getForm(@PathVariable("id") Long id) {
		return formServiceImpl.gatDataById(id);
	}

	@GetMapping("/add")
	public String getForm(Model model) {
		model.addAttribute("form", new FormCommand());
		return "form";
	}

	@PostMapping("/add")
	public String saveForm(@ModelAttribute FormCommand formCommand) {
		formServiceImpl.saveForm(formCommand);
		return "redirect:/add";
	}
}
