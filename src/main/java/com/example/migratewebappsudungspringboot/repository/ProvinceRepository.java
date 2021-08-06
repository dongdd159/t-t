package com.example.migratewebappsudungspringboot.repository;

import com.example.migratewebappsudungspringboot.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
