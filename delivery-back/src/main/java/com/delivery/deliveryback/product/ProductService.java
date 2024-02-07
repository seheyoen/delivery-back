package com.delivery.deliveryback.product;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

	@Autowired
    private ProductMapper productMapper;

    public List<ProductEntity> searchProduct() {
        return productMapper.searchProduct();
    }

}
