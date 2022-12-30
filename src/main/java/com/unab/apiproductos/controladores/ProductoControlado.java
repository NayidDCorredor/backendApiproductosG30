package com.unab.apiproductos.controladores;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.apiproductos.modelos.ProductoCrearModelo;
import com.unab.apiproductos.modelos.ProductoDTO;
import com.unab.apiproductos.servicios.IProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoControlado {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoServicio iProductoServicio;

    @GetMapping
    public String obtenerProductos(){
        return "get productos";
    }

    @PostMapping
    public ProductoRespuestaModelo crearProduto(@RequestBody ProductoCrearModelo productoCrearModelo){

        ProductoDTO productoDTO= modelMapper.map(productoCrearModelo, ProductoDTO.class);

        ProductoDTO productoDTOcreado= iProductoServicio.crearProducto(productoDTO);

        ProductoRespuestaModelo productoRespuestaModelo = modelMapper.map(productoDTOcreado, ProductoRespuestaModelo.class);

        return productoRespuestaModelo;
    }
}
