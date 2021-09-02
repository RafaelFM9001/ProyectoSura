package com.filomeno.examenrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.filomeno.examenrest.model.Producto;
import com.filomeno.examenrest.service.ProductoService;

@RestController
public class ProductoControllerImpl implements ProductoController{
	
	@Autowired
	ProductoService productoService;

	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return productoService.getProductos();
	}

	@Override
	public void addProducto(Producto producto) {
		// TODO Auto-generated method stub
		productoService.addProducto(producto);
	}

	@Override
	public void updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		productoService.updateProducto(producto);
	}

	@Override
	public void deleteProducto(long idProducto) {
		// TODO Auto-generated method stub
		productoService.deleteProducto(idProducto);
	}

}
