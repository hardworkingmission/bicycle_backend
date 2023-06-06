package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name = "tblcomment")
public class Comment extends Boilerplate {
    @Id
    @Column(name = "cmnt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cmnt_comment")
    private  String comment;
    @Column(name = "cmnt_item_id")
    private  long itemId;

    @Column(name = "cmnt_user_id")
    private  long userId;


}
