package com.health.payment.manager.controller;

import com.health.payment.manager.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthTestController {
    @Autowired
    private DataBaseService dataBaseService;

    public void selectMsg(){
        dataBaseService.query();
        return;
    }
}
