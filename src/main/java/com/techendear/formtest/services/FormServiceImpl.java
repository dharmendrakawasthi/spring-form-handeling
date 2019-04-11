package com.techendear.formtest.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techendear.formtest.commands.FormCommand;
import com.techendear.formtest.converters.FormCommandToForm;
import com.techendear.formtest.converters.FormToFormCommand;
import com.techendear.formtest.domains.Form;
import com.techendear.formtest.repositories.FormRepository;

@Service
public class FormServiceImpl implements FormService{

	
	private final FormRepository formRepository;
	private final FormCommandToForm formCommandToForm;
	private final FormToFormCommand formToFormCommand;
		

	public FormServiceImpl(FormRepository formRepository, FormCommandToForm formCommandToForm,
			FormToFormCommand formToFormCommand) {
		this.formRepository = formRepository;
		this.formCommandToForm = formCommandToForm;
		this.formToFormCommand = formToFormCommand;
	}

	@Override
	public Form saveForm(FormCommand formCommand) {
		Form form = formCommandToForm.convert(formCommand);
		return formRepository.save(form);
	}

	@Override
	public Optional<Form> gatDataById(Long id) {
		return formRepository.findById(id);
	}

}
