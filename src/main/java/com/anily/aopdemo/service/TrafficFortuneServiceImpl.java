package com.anily.aopdemo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService {
    @Override
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Expect heavy traffic this morning";
    }

    @Override
    public String getFortune(boolean excFlag) {
        if (excFlag) {
         throw new RuntimeException("Highway is closed");
        }
        return getFortune();
    }
}
