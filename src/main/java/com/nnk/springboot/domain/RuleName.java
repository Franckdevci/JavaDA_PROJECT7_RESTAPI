package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "RuleName")
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class RuleName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @NotEmpty(message = "Name is mandatory")
    @Size(max= 255, message= "Name cannot be longer than 255 characters")
    @Column(name = "name", nullable = false, length= 255)
    private String name;

    @NotEmpty(message = "Description is mandatory")
    @Size(max= 255, message= "Description cannot be longer than 255 characters")
    @Column(name = "description", nullable = false, length= 255)
    private String description;

    @Column
    private String json;

    @Column
    private String template;

    @Column
    private String sqlStr;

    @Column
    private String sqlPart;

}
