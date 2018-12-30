package com.practicafinal.gateway.entidades;

import java.time.Instant;
import java.util.Date;


public class ArticuloCompra {


    private Long id;

    private Articulo articulo;

    private Boolean entregado;

    private int cantidad;

    private Date fecha;

    public ArticuloCompra() {
        entregado = false;
        cantidad = 0;
        fecha = Date.from(Instant.now());
    }

    public ArticuloCompra(Articulo articulo, Boolean entregado, int cantidad, Date fecha) {
        this.articulo = articulo;
        this.entregado = entregado;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
