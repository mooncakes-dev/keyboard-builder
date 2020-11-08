package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.Build;
import org.springframework.data.repository.CrudRepository;

public interface BuildRepository extends CrudRepository<Integer, Build> {
}
