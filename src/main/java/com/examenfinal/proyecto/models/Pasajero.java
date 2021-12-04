package com.examenfinal.proyecto.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Pasajero {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    String nombre;
    String aPaterno;
    String aMaterno;
    String tipoDocumento;
    String numDocumento;
    Date fechaNacimiento;
    String telefono;
    String email;
    String clave;
    
    @Transient
    List<Pago> listaPagos;
    

    @ManyToOne
    @JoinColumn(name = "idpais")
    Pais pais;


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


    public String getaPaterno() {
        return aPaterno;
    }


    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }


    public String getaMaterno() {
        return aMaterno;
    }


    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public String getNumDocumento() {
        return numDocumento;
    }


    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }


    public List<Pago> getListaPagos() {
        return listaPagos;
    }


    public void setListaPagos(List<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }


    public Pais getPais() {
        return pais;
    }


    public void setPais(Pais pais) {
        this.pais = pais;
    }

    


}
