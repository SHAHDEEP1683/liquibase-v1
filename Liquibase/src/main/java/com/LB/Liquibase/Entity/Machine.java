package com.LB.Liquibase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="liquibase_machine")
public class Machine {

    @Id
    private int mach_id;
    private String mach_name;
    private String used;

}
