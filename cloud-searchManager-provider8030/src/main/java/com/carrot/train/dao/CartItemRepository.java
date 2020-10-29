package com.carrot.train.dao;

import com.carrot.train.entities.CartItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface CartItemRepository extends ElasticsearchRepository<CartItem,String> {
    CartItem queryCartItemById(String id);
}
