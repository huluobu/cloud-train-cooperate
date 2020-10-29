package com.carrot.train.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: carrot
 * @Date: 2020/10/9 15:25
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "cartindex", type = "cartitem", shards = 1, replicas = 0)
public class CartItem  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Integer id;
    @Field
    private Integer filmid;
    @Field
    private String filmtype;
    @Field
    private Integer matchid;
    @Field
    private String seatnum;
    @Field
    private BigDecimal price;
}
