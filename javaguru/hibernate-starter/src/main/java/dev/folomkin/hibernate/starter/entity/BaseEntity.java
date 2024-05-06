package dev.folomkin.hibernate.starter.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public interface BaseEntity<T extends Serializable>{

    T getI();
    void setI(T i);
}
