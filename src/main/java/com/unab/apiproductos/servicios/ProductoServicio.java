package com.unab.apiproductos.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.apiproductos.modelos.ProductoDTO;
import com.unab.apiproductos.modelos.ProductoEntidad;
import com.unab.apiproductos.repositorios.IProductoRepositorio;

@Service
public class ProductoServicio implements IProductoServicio {


    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoRepositorio iProductoRepositorio;

    @Override
    public List<ProductoDTO> obtenerProductos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        ProductoEntidad productoEntidad = modelMapper.map(productoDTO, ProductoEntidad.class);
        productoEntidad.setEstado(true);

        ProductoEntidad productoEntidadCreado= iProductoRepositorio.save(productoEntidad);
        ProductoDTO productoDTOCreado = modelMapper.map(productoEntidadCreado, ProductoDTO.class);

        return productoDTOCreado;
    }
    
}
