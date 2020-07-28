/**
 * FileName: TestServiceImpl
 * Author:   songfz
 * Date:     2019/2/26 10:19
 * Description: 测试
 */
package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.service.Producer;
import com.dubbo.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author songfz
 * @create 2019/2/26
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Autowired
    private Producer producer;
    @Override
    public String hello(String name) {
        this.producer.send("log","kafka 传输第一个数据"+name);
        return "Hello World! " + name;
    }
}
