package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;

@Entity
@Table(name = "CurvePoint")
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class CurvePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Curve ID must not be null")
    @Column(name = "curveId")
    @Min(value = 1, message = "Curve ID must be positive and higher than 0")
    private Integer curveId;

    @Column
    private Timestamp asOfDate;

    @NotNull(message = "Term must not be null")
    @Column(name ="term")
    @Min(value = 1, message = "Term must be positive and higher than 0")
    private Double term;

    @NotNull(message = "value must not be null")
    @Column(name ="value")
    @Min(value = 1, message = "Term must be positive and higher than 0")
    private Double value;

    @Column
    private Timestamp creationDate;

}
