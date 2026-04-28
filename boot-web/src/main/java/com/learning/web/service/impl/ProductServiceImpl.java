package com.learning.web.service.impl;

import com.learning.web.dto.CreateProductRequest;
import com.learning.web.service.ProductService;
import com.learning.web.vo.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService {

    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public ProductResponse create(CreateProductRequest request) {
        return new ProductResponse(
                idGenerator.getAndIncrement(),
                request.name(),
                request.priceInCents()
        );
    }
}
