package com.techendear.formtest.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.techendear.formtest.commands.FormCommand;
import com.techendear.formtest.domains.Form;

@Component
public class FormToFormCommand implements Converter<Form, FormCommand>{

	@Override
	public FormCommand convert(Form source) {
		if (source == null) {
			return null;
		}
		FormCommand formCommand = new FormCommand();
		formCommand.setName(source.getName());
		formCommand.setEmail(source.getEmail());
		return formCommand;
	}

}
