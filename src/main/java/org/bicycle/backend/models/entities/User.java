package org.bicycle.backend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbluser")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private  String name;

    @Column(name = "user_email")
    private  String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_token")
    private String token;
    @Column(name = "user_role")
    private Long role;

    @PrePersist
    public  void  defaultValues(){
        if(role.equals(null)){
            this.role = 1L;
        }
    }


}
