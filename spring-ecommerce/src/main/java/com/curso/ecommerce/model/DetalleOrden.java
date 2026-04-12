package com.curso.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double cantidad;
    private double price;
    private double total;

    @ManyToOne
    private Orden orden;

    @ManyToOne
    private Producto producto;

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public DetalleOrden() {
    }

    public DetalleOrden(Integer id, String name, double cantidad, double price, double total) {
        this.id = id;
        this.name = name;
        this.cantidad = cantidad;
        this.price = price;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cantidad=" + cantidad +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
