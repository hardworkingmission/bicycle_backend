package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblbrand")
public class Brand {

    @Id
    @Column(name = "bnd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bnd_name")
    private String name;
    @Column(name = "bnd_description")
    private String description;

}
