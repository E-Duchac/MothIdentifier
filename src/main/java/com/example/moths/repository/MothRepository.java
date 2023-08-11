//Equivalent to the DTO files. Reduplication for
//the sake of preserving skill.

package com.example.moths.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.moths.model.Moth;

public interface MothRepository extends MongoRepository<Moth, String> {
    
}
