package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblcategory")
@Builder(setterPrefix = "set")
public class Category {

    @Id
    @Column(name = "ctg_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ctg_name")
    private String name;
    @Column(name = "ctg_description")
    private String description;

}
