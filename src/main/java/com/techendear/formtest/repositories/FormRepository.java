package com.techendear.formtest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.techendear.formtest.domains.Form;

public interface FormRepository extends CrudRepository<Form, Long> {

}
