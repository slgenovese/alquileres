/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author sgenovese
 */
public class PropiedadDTO implements Serializable{
    private long id_propiedad;
    private String tipo;
    private String direccion;
    private double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;

/*    public PropiedadDTO(long id_propiedad, String tipo, String direccion, double valor_alquiler, String nombre_inquilino, String apellido_inquilino) {
        this.id_propiedad = id_propiedad;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre_inquilino = nombre_inquilino;
        this.apellido_inquilino = apellido_inquilino;
    }
*/
    public long getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValor_alquiler() {
        return valor_alquiler;
    }

    public void setValor_alquiler(double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }

    public String getNombre_inquilino() {
        return nombre_inquilino;
    }

    public void setNombre_inquilino(String nombre_inquilino) {
        this.nombre_inquilino = nombre_inquilino;
    }

    public String getApellido_inquilino() {
        return apellido_inquilino;
    }

    public void setApellido_inquilino(String apellido_inquilino) {
        this.apellido_inquilino = apellido_inquilino;
    }

    
}
