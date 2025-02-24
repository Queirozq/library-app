package com.queiroz.library.catalog.web.controllers;

import com.queiroz.library.catalog.domain.ProductEntity;
import com.queiroz.library.catalog.domain.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    List<ProductEntity> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo) {
        // return productService.getProducts();
        return null;
    }
}
