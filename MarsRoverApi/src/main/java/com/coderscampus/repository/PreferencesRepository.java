package com.coderscampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.coderscampus.Dto.HomeDto;

public interface PreferencesRepository extends JpaRepository<HomeDto, Long>{
	
    //I'm leaving the below code commented out, it can be usd as a reference for how to 
	//create custom query.
	//@Query("select dto from HomeDto dto where userId = :userId")
	HomeDto findByUserId(Long userId);

}
