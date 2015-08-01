package com.ylw.spring.data.repository;

import com.ylw.spring.data.model.A;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yingliangdu on 7/31/15.
 */
public interface ARepository extends CrudRepository<A, Long> {
    List<A> findByName(String name);
}
