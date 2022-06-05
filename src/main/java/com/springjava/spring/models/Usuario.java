package com.springjava.spring.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    public Long id;

    @Getter @Setter @Column(name="nombre")
    public String nombre;

    @Getter @Setter @Column(name="apellido")
    public String apellido;

    @Getter @Setter @Column(name="email")
    public String email;

    @Getter @Setter @Column(name="telefono")
    public String telefono;

    @Getter @Setter @Column(name="password")
    public String password;

}
