package com.curso.ecommerce.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String direccion;
    private String tipo;
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;


    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;

    public Usuario(Integer id, String name, String username, String email, String direccion, String tipo, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.tipo = tipo;
        this.password = password;
    }

    public Usuario() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
