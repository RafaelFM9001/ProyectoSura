package com.filomeno.examenrest.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filomeno.examenrest.dao.ProductoDao;
import com.filomeno.examenrest.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoDao productoDao;
	
	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public void addProducto(Producto producto) {
		// TODO Auto-generated method stub
		productoDao.save(producto);
	}

	@Override
	public Producto getProducto(long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).get();
	}

	@Override
	public void updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		Producto prod = getProducto(producto.getClaveProducto());
		prod.setNombre(producto.getNombre());
		prod.setPrecio(producto.getPrecio());
		prod.setCantidadProducto(producto.getCantidadProducto());
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat(“yyyy-MM-dd”);
		String strFecha = “2007-12-25”;
		Date fecha = null;
		try {

		fecha = formatoDelTexto.parse(producto.getFechaCaducidad());

		} catch (ParseException ex) {

		ex.printStackTrace();

		}
		prod.setFechaCaducidad(producto.getFechaCaducidad());
		productoDao.save(prod);
	}

	@Override
	public void deleteProducto(long idProducto) {
		// TODO Auto-generated method stub
		productoDao.deleteById(idProducto);
	}

}
