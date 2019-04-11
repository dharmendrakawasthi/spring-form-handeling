package com.techendear.formtest.services;

import java.util.Optional;

import com.techendear.formtest.commands.FormCommand;
import com.techendear.formtest.domains.Form;

public interface FormService {

	public Form saveForm(FormCommand formCommand);
	public Optional<Form> gatDataById(Long id);
}
