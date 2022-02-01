package com.scode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Map;
import java.util.UUID;

@Table("emp_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpEntity {
    @PrimaryKey
    private UUID id;
    private String name;
    private Map<Integer, String> dept;
}
