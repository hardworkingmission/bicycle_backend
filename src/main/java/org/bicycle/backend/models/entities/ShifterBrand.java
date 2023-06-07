package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblshifterbrand")
public class ShifterBrand {

    @Id
    @Column(name = "sbnd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sbnd_name")
    private String name;
    @Column(name = "sbnd_description")
    private String description;

}
