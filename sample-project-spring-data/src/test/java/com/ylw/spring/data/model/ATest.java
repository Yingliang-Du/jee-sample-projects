package com.ylw.spring.data.model;

import com.ylw.spring.data.SpringConfig;
import com.ylw.spring.data.repository.ARepository;
import com.ylw.spring.data.repository.BRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by yingliangdu on 7/31/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class }) // Test using H2 in-memory database
public class ATest {
    @Autowired
    private ARepository repository;

    @Autowired
    private BRepository bRepository;

    @Before
    public void clearDB() {
        repository.deleteAll();
        bRepository.deleteAll();
    }

    @Test
    public void save() {
        A a = new A();
        a.setName("TestA");
        // Assert before save
        assertNull(a.getId());

        // Call business method - save
        repository.save(a);

        //Assert after save
        assertNotNull(a.getId());

        // Verify results
        List<A> as = (List<A>) repository.findAll();
        assertEquals(1, as.size());
        A a2 = as.get(0);
        assertEquals(a.getName(), a2.getName());
    }

    @Test
    public void saveAsWithBs() {
        A a = new A();
        a.setName("A1");
        assertNull(a.getId());

        B b = new B();
        b.setName("B1");
        assertNull(b.getId());

        bRepository.save(b);
        assertNotNull(b.getId());

        a.getBs().add(b);
        repository.save(a);
        assertNotNull(a.getId());
    }
}
