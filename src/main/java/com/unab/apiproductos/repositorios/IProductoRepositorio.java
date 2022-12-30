package com.unab.apiproductos.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.apiproductos.modelos.ProductoEntidad;

@Repository
public interface IProductoRepositorio extends CrudRepository <ProductoEntidad, Long> {
    
}
