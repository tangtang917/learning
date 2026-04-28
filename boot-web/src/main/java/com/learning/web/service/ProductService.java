package com.learning.web.service;

import com.learning.web.dto.CreateProductRequest;
import com.learning.web.vo.ProductResponse;

public interface ProductService {

    ProductResponse create(CreateProductRequest request);
}
