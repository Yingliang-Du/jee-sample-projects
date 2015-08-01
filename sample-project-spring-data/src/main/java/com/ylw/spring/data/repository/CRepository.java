package com.ylw.spring.data.repository;

import com.ylw.spring.data.model.C;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yingliangdu on 7/31/15.
 */
public interface CRepository extends CrudRepository<C, Long> {
    List<C> findByName(String name);
}
