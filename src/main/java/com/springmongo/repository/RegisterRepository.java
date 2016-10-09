package com.springmongo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springmongo.model.RegisterModel;
/* 
 * just extends crudRepository of springboot and create function
 * like below.
 * */
public interface RegisterRepository extends CrudRepository<RegisterModel,String> {
	/* we do not need to write query. just create function springboot will do all
	 * things for us.
	 * for example: if you want to search user by zipcode then
	 * 	findByZipcode(String zipcode)
	 * 
	 */
	public RegisterModel findByFirstName(String firstName);
	public List<RegisterModel> findByLastName(String lastName);
}
