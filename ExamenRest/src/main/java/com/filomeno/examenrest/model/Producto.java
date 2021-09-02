package com.filomeno.examenrest.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@Column(name = "clave_producto")
	private long claveProducto;
	private String nombre;
	private double precio;
	@Column(name = "cant_almacen")
	private int cantidadProducto;
	@Column(name = "fecha_caducidad")
	private String fechaCaducidad;
	
	public long getClaveProducto() {
		return claveProducto;
	}
	public void setClaveProducto(long claveProducto) {
		this.claveProducto = claveProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public Producto() {
		super();
	}
	public Producto(long claveProducto, String nombre, double precio, int cantidadProducto, String fechaCaducidad) {
		super();
		this.claveProducto = claveProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadProducto = cantidadProducto;
		this.fechaCaducidad = fechaCaducidad;
	}
}
