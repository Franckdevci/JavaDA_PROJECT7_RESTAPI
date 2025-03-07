package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="userName")
    @NotBlank(message = "Username is mandatory")
    private String userName;

    @Column(name ="password")
    @NotBlank(message = "Password is mandatory")
    private String password;

    @Column(name ="fullName")
    @NotBlank(message = "FullName is mandatory")
    private String fullName;

    @Column(name ="role")
    @NotBlank(message = "Role is mandatory")
    private String role;

}
