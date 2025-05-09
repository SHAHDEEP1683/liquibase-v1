package com.LB.Liquibase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="liquibase_person")
public class Person {

    @Id
    private int id;
    private String name;

}
