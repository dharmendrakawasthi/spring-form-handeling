package com.techendear.formtest.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.techendear.formtest.commands.FormCommand;
import com.techendear.formtest.domains.Form;

@Component
public class FormCommandToForm implements Converter<FormCommand, Form> {

	@Override
	public Form convert(FormCommand source) {
		if (source == null) {
			return null;
		}
		Form form = new Form();
		form.setName(source.getName());
		form.setEmail(source.getEmail());
		return form;
	}

}
