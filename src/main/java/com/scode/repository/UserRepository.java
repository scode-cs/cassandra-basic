package com.scode.repository;

import com.scode.entity.UserEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<UserEntity, Integer> {
}
