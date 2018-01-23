package com.health.payment.manager.service.impl;

import com.health.payment.manager.service.DataBaseService;
import org.springframework.stereotype.Service;

/**
 * @auther Administrator
 * @date 2017/9/22
 */
@Service
public class DataBaseServiceImpl implements DataBaseService {

    @Override
    public void query() {
        System.out.println("查询信息------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String testReturn(String ss) {
        return "testReturn";
    }
}
