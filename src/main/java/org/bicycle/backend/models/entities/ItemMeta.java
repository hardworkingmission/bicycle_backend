package org.bicycle.backend.models.entities;

import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblcategory")
@TypeDef(name = "json", typeClass = JsonType.class)
public class ItemMeta {

    @Id
    @Column(name = "imeta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "imeta_key")
    private String key;
    @Type(type = "json")
    @Column(name = "imeta_value", columnDefinition = "json")
    private JsonNode value;

    @Column(name = "imeta_item_id")
    private long itemId;

}
