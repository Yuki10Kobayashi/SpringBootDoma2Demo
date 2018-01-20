package com.example.demo.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "anything")
public class AnythingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public Timestamp createdAt;

    public Timestamp updatedAt;
}
