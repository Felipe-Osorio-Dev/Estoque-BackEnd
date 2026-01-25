package com.dev.osorio.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "produto")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_produto", unique = true, nullable = false)
    @NotNull(message = "Codigo do produto necessario para cadastro!")
    private String codProduct;

    @Column(name = "nome", nullable = false)
    @NotBlank(message = "Nome do produto necessario para cadastro!")
    private String name;

    @Column(name = "unidade", nullable = false)
    @NotNull
    private Integer unit;

    @Column(name = "validade", nullable = false)
    @NotNull
    private LocalDate validate;

    public ProductEntity() {
    }

    public ProductEntity(String codProduct, String name, Integer unit, LocalDate validate) {
        this.codProduct = codProduct;
        this.name = name;
        this.unit = unit;
        this.validate = validate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public LocalDate getValidate() {
        return validate;
    }

    public void setValidate(LocalDate validate) {
        this.validate = validate;
    }
}
