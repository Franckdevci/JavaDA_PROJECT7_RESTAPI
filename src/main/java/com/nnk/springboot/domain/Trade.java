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

import java.sql.Timestamp;

@Entity
@Table(name = "Trade")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer tradeId;

    @NotEmpty(message = "Account is mandatory")
    @Size(max= 255, message= "Account cannot be longer than 255 characters")
    @Column(name = "account", nullable = false, length= 255)
    private String account;

    @NotEmpty(message = "Type is mandatory")
    @Size(max= 255, message= "Type cannot be longer than 255 characters")
    @Column(name = "type", nullable = false, length= 255)
    private String type;

    @NotNull(message = "Buy Quantity is mandatory")
    @Column(name ="buyQuantity")
    @Min(value = 1, message = "Buy Quantity must be positive and higher than 0")
    private Double buyQuantity;

    @NotNull(message = "Sell Quantity is mandatory")
    @Column(name ="sellQuantity")
    @Min(value = 1, message = "Sell Quantity must be positive and higher than 0")
    private Double sellQuantity;

    @NotNull(message = "Buy Price is mandatory")
    @Column(name ="buyPrice")
    @Min(value = 1, message = "Buy Price must be positive and higher than 0")
    private Double buyPrice;

    @NotNull(message = "sell Price is mandatory")
    @Column(name ="sellPrice")
    @Min(value = 1, message = "sellPrice must be positive and higher than 0")
    private Double sellPrice;

    @Column(name ="benchmark")
    private String benchmark;

    @Column(name ="tradeDate")
    private Timestamp tradeDate;

    @Column(name ="security")
    private String security;

    @Column(name ="status")
    private String status;

    @Column(name ="trader")
    private String trader;

    @Column(name ="book")
    private String book;

    @Column(name ="creationName")
    private String creationName;

    @Column(name ="creationDate")
    private Timestamp creationDate;

    @Column(name ="revisionName")
    private String revisionName;

    @Column(name ="revisionDate")
    private Timestamp revisionDate;

    @Column(name ="dealName")
    private String dealName;

    @Column(name ="dealType")
    private String dealType;

    @Column(name ="sourceListId")
    private String sourceListId;

    @Column(name ="side")
    private String side;

}
