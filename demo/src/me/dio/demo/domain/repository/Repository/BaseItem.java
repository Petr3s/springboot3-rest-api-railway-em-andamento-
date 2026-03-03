package me.dio.demo.domain.repository.Repository;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}