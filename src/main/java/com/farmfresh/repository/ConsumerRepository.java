package com.farmfresh.repository;

import com.farmfresh.model.Consumer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsumerRepository extends MongoRepository<Consumer, String> {
    Optional<Consumer> findByEmail(String email);
    boolean existsByEmail(String email);
}