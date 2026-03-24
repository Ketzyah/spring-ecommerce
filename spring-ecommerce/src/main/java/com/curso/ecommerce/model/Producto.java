package com.curso.ecommerce.model;

public class Producto {

    private Integer id;
    private String name;
    private String description;
    private String imagen;
    private double price;
    private int cantidad;

    public Producto() {
    }

    public Producto(Integer id, String name, String description, String imagen, double price, int cantidad) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagen = imagen;
        this.price = price;
        this.cantidad = cantidad;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagen='" + imagen + '\'' +
                ", price=" + price +
                ", cantidad=" + cantidad +
                '}';
    }
}
