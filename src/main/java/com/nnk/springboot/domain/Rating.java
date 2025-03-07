package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;


    @NotEmpty(message = "Moody's rating is mandatory")
    @Size(max= 255, message= "Moody's cannot be longer than 255 characters")
    @Column(name = "moodysRating", nullable = false, length= 255)
    private String moodysRating;

    @NotEmpty(message = "S&P Rating is mandatory")
    @Size(max= 255, message= "S&P Rating cannot be longer than 255 characters")
    @Column(name = "sandPRating", nullable = false, length= 255)
    private String sandPRating;

    @NotEmpty(message = "Fitch Rating is mandatory")
    @Size(max= 255, message= "Fitch rating cannot be longer than 255 characters")
    @Column(name = "fitchRating", nullable = false, length= 255)
    private String fitchRating;

    @NotNull(message = "Order number is mandatory")
    @Column(name = "orderNumber")
    @Min(value = 1, message = "Order number must be positive and higher than 0")
    private Integer orderNumber;


}
