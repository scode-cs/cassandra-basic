package com.scode.repository;

import com.scode.entity.EmpEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface EmpRepository extends CassandraRepository<EmpEntity, UUID> {

    List<EmpEntity> findAllByDeptContains(String deptName);
}
