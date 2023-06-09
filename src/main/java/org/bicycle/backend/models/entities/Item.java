package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblitem")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "item_brand_id")
    private long brandId;

    @Column(name = "item_frame_size")
    private String frameSize;

    @Column(name = "item_material")
    private String material;

    @Column(name = "item_wheel_size")
    private String wheelSize;

    @Column(name = "item_saddle")
    private String saddle;

    @Column(name = "item_brake_set")
    private String brakeSet;

    @Column(name = "item_rim")
    private String rim;

    @Column(name = "item_hub")
    private String hub;

    @Column(name = "item_free_wheel")
    private String freeWheel;

    @Column(name = "item_chain")
    private String chain;

    @Column(name = "item_chain_wheel")
    private String chainWheel;

    @Column(name = "item_left_shifter")
    private String leftShifter;

    @Column(name = "item_right_shifter")
    private String rightShifter;

    @Column(name = "item_front_derailleur")
    private String frontDerailleur;

    @Column(name = "item_stem")
    private String stem;

    @Column(name = "item_color_id")
    private long colorId;

    @Column(name = "item_origin_id")
    private long originId;

    @Column(name = "item_price")
    private long price;

    @Column(name = "item_gear_system")
    private String gearSystem;

    @Column(name = "item_shifter_brand_id")
    private long shifterBrandId;

    @Column(name = "item_category_id")
    private long categoryId;

    @Column(name = "item_release_year")
    private String releaseYear;


}
