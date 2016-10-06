package com.springmongo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springmongo.model.RegisterModel;

public interface RegisterRepository extends CrudRepository<RegisterModel,String> {
	public RegisterModel findByFirstName(String firstName);
	public List<RegisterModel> findByLastName(String lastName);
}
