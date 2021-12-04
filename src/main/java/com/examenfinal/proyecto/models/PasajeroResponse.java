package com.examenfinal.proyecto.models;

public class PasajeroResponse {
    private int id;
    private String nombre;
    private String apellidos;
    private int cantidadReservas;

    public PasajeroResponse(Pasajero pasajero){
        this.id = pasajero.getId();
        this.nombre = pasajero.getNombre().toUpperCase();
        this.apellidos = pasajero.getaPaterno().toUpperCase() + " " +pasajero.getaMaterno().toUpperCase();
        this.cantidadReservas = pasajero.getListaPagos().size();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getCantidadReservas() {
        return cantidadReservas;
    }
    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    @Override
    public String toString() {
        return "PasajeroResponse [apellidos=" + apellidos + ", cantidadReservas=" + cantidadReservas + ", id=" + id
                + ", nombre=" + nombre + "]";
    }


}
