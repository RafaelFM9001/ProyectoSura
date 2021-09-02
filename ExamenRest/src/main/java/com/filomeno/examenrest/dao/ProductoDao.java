package com.filomeno.examenrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.filomeno.examenrest.model.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
