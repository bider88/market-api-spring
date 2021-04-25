package com.irvingdidier.market.persitence.crud;

import com.irvingdidier.market.persitence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
