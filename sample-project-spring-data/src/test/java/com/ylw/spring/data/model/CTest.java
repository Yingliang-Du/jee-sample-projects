package com.ylw.spring.data.model;

import com.ylw.spring.data.SpringConfig;
import com.ylw.spring.data.repository.CRepository;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yingliangdu on 7/31/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class }) // Test using H2 in-memory database
public class CTest {
    @Autowired
    private CRepository repository;

    @Test
    public void save() {
        C c = new C();
        c.setName("TestC");
        // Assert before save
        assertNull(c.getId());

        // Call business method - save
        repository.save(c);

        //Assert after save
        assertNotNull(c.getId());

        // Verify results
        List<C> cs = (List<C>) repository.findAll();
        assertEquals(1, cs.size());
        C c2 = cs.get(0);
        assertEquals(c.getName(), c2.getName());
    }
}
