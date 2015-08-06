package com.ylw.spring.data.repository;

import com.ylw.spring.data.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yingliangdu on 8/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class }) // Test using H2 in-memory database
public class BRepositoryTest {
    @Autowired
    private BRepository repository;

    @Autowired
    private CRepository cRepository;

    /**
     * Test case: Create B, Create Cs with status - C
     */
    @Test
    public void saveBWithCs() {
        

    }
}
