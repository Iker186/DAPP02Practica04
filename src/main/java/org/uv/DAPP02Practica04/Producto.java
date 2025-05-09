package org.uv.DAPP02Practica04;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @Column
    @GeneratedValue(generator = "productos_clave_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "productos_clave_seq", sequenceName = "productos_clave_seq", initialValue = 1, allocationSize = 1)
   
    private Long clave;
    
    @Column
    private String nombre;

    @Column
    private BigDecimal precio;

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
