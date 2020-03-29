package com.base.dao;

import org.springframework.data.repository.CrudRepository;

import com.base.model.AUsers;

public interface AUserRepo extends CrudRepository<AUsers, Integer> 
{
	

}
