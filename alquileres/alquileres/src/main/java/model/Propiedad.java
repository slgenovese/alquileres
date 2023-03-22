/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sgenovese
 */
public class Propiedad {
    private long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private double metros_cuadrados;
    private double valor_alquiler;

    public Propiedad(long id_propiedad, String tipo_propiedad, String direccion, double metros_cuadrados, double valor_alquiler) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquiler = valor_alquiler;
    }

    public long getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getTipo_propiedad() {
        return tipo_propiedad;
    }

    public void setTipo_propiedad(String tipo_propiedad) {
        this.tipo_propiedad = tipo_propiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public double getValor_alquiler() {
        return valor_alquiler;
    }

    public void setValor_alquiler(double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }
    

}
