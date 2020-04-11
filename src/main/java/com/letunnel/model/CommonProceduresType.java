package com.letunnel.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "procedures_types")
public class CommonProceduresType extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
