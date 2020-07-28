package com.dubbo.demo.service;

/**
 * @author songfz
 * @date 2019/5/7 15:20
 */
public interface Producer {

    void send(String topic, String message);
}
