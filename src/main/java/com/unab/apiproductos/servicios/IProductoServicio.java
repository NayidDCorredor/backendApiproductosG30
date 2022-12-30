package com.unab.apiproductos.servicios;

import java.util.List;

import com.unab.apiproductos.modelos.ProductoDTO;

public interface IProductoServicio {
    
    List<ProductoDTO> obtenerProductos();

    ProductoDTO crearProducto(ProductoDTO productoDTO);
}
