package com.letunnel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "procedures")
public class CommonProcedures extends BaseEntity {

    @Column(name = "number")
    private String number;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="procedures_types_id")
    private CommonProceduresType type;

}
