package com.ylw.spring.data.service;

import javax.transaction.Transactional;

/**
 * Created by yingliangdu on 8/4/15.
 */
public interface ModelService {
    void saveAsWithBs();

    public class Impl implements ModelService {

        /**
         * Use Case: Create As; Add Bs to As; Update status in Cs
         */
        @Transactional
        public void saveAsWithBs() {

        }

        /**
         * Use Case: Create Cs; Add Cs to B
         */
        public void saveBWithCs() {

        }
    }
}
