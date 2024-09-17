package com.keniding.tomato.person.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "contraseniaHash")
@EqualsAndHashCode(exclude = "contraseniaHash")
@Document(collection = "personas")
public class Person {
    @Id
    private String id;

    @Indexed
    private String nombre;

    @Indexed
    private String apellido;

    @Indexed(unique = true)
    private String email;

    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    private String contraseniaHash;

    private String genero;
    private String nacionalidad;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;

    public void setContraseña(String contraseña) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.contraseniaHash = encoder.encode(contraseña);
    }

    public boolean verificarContraseña(String contraseñaIngresada) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(contraseñaIngresada, this.contraseniaHash);
    }
}