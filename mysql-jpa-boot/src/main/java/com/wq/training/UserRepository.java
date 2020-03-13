package com.wq.training;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	User findByAddress(String address);
	
	
	//@Query(value="select * from user where name:name",nativeQuery=true)
	//User findOther @Param(value="name"

}
