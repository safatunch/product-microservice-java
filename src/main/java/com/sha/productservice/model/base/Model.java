package com.sha.productservice.model.base;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
public class Model {
    @Column(nullable = false)
    protected LocalDateTime CreatedAt;
    protected LocalDateTime UpdatedAt;
    protected LocalDateTime DeletedAt;
}
