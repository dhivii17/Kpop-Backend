package com.example.demo.Repository;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.KModel;
@SpringBootConfiguration
@Repository
public interface KRepository extends JpaRepository<KModel,Integer> {
	
                  
}
