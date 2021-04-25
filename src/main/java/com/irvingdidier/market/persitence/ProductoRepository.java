package com.irvingdidier.market.persitence;

import com.irvingdidier.market.persitence.crud.ProductoCrudRepository;
import com.irvingdidier.market.persitence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
