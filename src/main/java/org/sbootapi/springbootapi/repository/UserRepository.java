package org.sbootapi.springbootapi.repository;


import org.sbootapi.springbootapi.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {

}

