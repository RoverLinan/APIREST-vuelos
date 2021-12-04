package com.examenfinal.proyecto.models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Pago {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    Date fecha;
    double monto;
    String tipoComprobante;
    String numComprobante;
    double impuesto;


    @ManyToOne
    @JoinColumn(name = "idpasajero")
    Pasajero pasajero;

    @OneToOne
    @JoinColumn(name = "idreserva")
    Reserva reserva;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }


}
