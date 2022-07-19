package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Proveedores")
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_proveedor")
    private int id_proveedor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_alta")
    private Date fecha_alta;
    @Column(name = "id_cliente")
    private int id_cliente;

    public Proveedor(){

    }

    public Proveedor(int id_proveedor, String nombre, Date fecha_alta, int id_cliente){
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.fecha_alta = fecha_alta;
        this.id_cliente = id_cliente;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id_proveedor=" + id_proveedor +
                ", nombre='" + nombre + '\'' +
                ", fecha_alta=" + fecha_alta +
                ", id_cliente=" + id_cliente +
                '}';
    }
}
