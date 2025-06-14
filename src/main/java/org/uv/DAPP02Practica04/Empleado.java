package org.uv.DAPP02Practica04;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")

public class Empleado {
    @Id
    @Column
    @GeneratedValue(generator = "empleados_clave_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="empleados_clave_seq",
            sequenceName = "empleados_clave_seq", initialValue = 1,
            allocationSize = 1)
    private Long clave;
    
    @Column
    private String nombre;
    
    @Column
    private String direccion;
    
    @Column
    private String telefono;

    public Long getClave() {
        return clave;
    }

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

}
