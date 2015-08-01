package com.ylw.spring.data.repository;

import com.ylw.spring.data.model.B;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yingliangdu on 7/31/15.
 */
public interface BRepository extends CrudRepository<B, Long> {
    List<B> findByName(String name);
}
