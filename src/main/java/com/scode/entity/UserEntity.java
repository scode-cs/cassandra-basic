package com.scode.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_data")
@Data
public class UserEntity {
    @Column
    @PrimaryKey
    private Integer userId;
    @Column
    private String userName;
}
