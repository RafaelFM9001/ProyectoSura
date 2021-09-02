package com.filomeno.examenrest.service;

import java.util.List;

import com.filomeno.examenrest.model.Producto;

public interface ProductoService {
	public List<Producto> getProductos();
	public void addProducto(Producto producto);
	public Producto getProducto(long id);
	public void updateProducto(Producto producto);
	public void deleteProducto(long idProducto);
}
